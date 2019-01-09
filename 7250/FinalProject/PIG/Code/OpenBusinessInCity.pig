REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/json-simple-1.1.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/google-collections-1.0.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-hadoop-compat-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-core-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-pig-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/piggybank-0.12.0.jar

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ($0#'hours'#'Monday' IS NOT NULL);
C = GROUP B BY $0#'city';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/openMon_output.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS'); 

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ($0#'hours'#'Tuesday' IS NOT NULL);
C = GROUP B BY $0#'city';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/openTue_output.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS');

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ($0#'hours'#'Wednesday' IS NOT NULL);
C = GROUP B BY $0#'city';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/openWed_output.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS');

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ($0#'hours'#'Thursday' IS NOT NULL);
C = GROUP B BY $0#'city';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/openThurs_output.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS');

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ($0#'hours'#'Friday' IS NOT NULL);
C = GROUP B BY $0#'city';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/openFri_output.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS');

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ($0#'hours'#'Saturday' IS NOT NULL);
C = GROUP B BY $0#'city';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/openSat_output.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS');

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ($0#'hours'#'Sunday' IS NOT NULL);
C = GROUP B BY $0#'city';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/openSun_output.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS');