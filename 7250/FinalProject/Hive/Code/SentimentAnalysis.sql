SELECT sentences(text), review_id, stars FROM reviewtable LIMIT 1;
CREATE VIEW v1 AS SELECT review_id, stars, word FROM reviewtable lateral view explode(sentences(text)) table1 as word LIMIT 200;
CREATE VIEW v2 AS SELECT review_id, stars, word2 FROM v1 lateral view explode(word) table2 AS word2;

 
CREATE VIEW v3 AS SELECT v2.review_id, v2.stars, v2.word2, 
    CASE p.polarity 
      WHEN '1' then 1 WHEN '-1' then -1 ELSE 0 END AS polarity 
FROM v2 LEFT OUTER JOIN p_n_table p ON v2.word2 = p.word;
 

CREATE VIEW v3_pos AS SELECT review_id, stars, COUNT(polarity) AS pos_pol FROM v3 WHERE polarity = 1 GROUP BY review_id,stars;

CREATE VIEW v3_neg AS SELECT review_id, stars, COUNT(polarity) AS neg_pol FROM v3 WHERE polarity = -1 GROUP BY review_id,stars;

CREATE VIEW v3_neu AS SELECT review_id, stars, COUNT(polarity) AS neu_pol FROM v3 WHERE polarity = 0 GROUP BY review_id,stars;

CREATE VIEW v4 AS SELECT a.review_id, a.stars, a.pos_pol, b.neg_pol, c.neu_pol FROM v3_pos AS a LEFT OUTER JOIN v3_neg AS b ON a.review_id=b.review_id LEFT OUTER JOIN v3_neu AS c ON a.review_id = c.review_id;


drop table if exists review_perc_table;
CREATE TABLE review_perc_table ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' AS SELECT * FROM v4;
