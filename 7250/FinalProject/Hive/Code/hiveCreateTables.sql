

drop table if exists reviewtable;
CREATE TABLE reviewtable(
votes map<string,int>,
user_id string,
review_id string,
stars int,
review_date DATE,
text string,
type string,
business_id string) 
ROW FORMAT SERDE 'org.apache.hive.hcatalog.data.JsonSerDe'

STORED AS TEXTFILE;
LOAD DATA LOCAL INPATH  '/Users/yanglintong/7250/finalProject/dataset/review_json_small.json' OVERWRITE INTO TABLE reviewtable; 



drop table if exists p_n_table;
CREATE TABLE p_n_table(
word string,
polarity string
) 
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' STORED AS TEXTFILE;
LOAD DATA LOCAL INPATH '/Users/yanglintong/7250/finalProject/Hive/positive_negative_words.csv' OVERWRITE INTO TABLE p_n_table;


drop table if exists businesstable;
CREATE TABLE businesstable(
business_id string,
full_address string,
hours map<string, map<string,string>>,
open string,
categories array<string>,
city string,
review_count int,
name string,
neighborhoods array<string>,
longitude double,
state string,
stars double,
latitude double
) 
ROW FORMAT SERDE 'org.apache.hive.hcatalog.data.JsonSerDe'
  
STORED AS TEXTFILE;
LOAD DATA LOCAL INPATH '/Users/yanglintong/7250/finalProject/dataset/business_json_small.json' OVERWRITE INTO TABLE businesstable;
