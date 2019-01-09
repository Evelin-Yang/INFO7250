REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/json-simple-1.1.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/google-collections-1.0.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-hadoop-compat-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-core-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-pig-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/piggybank-0.12.0.jar

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = GROUP A BY $0#'city';
C = FOREACH B GENERATE group, COUNT(A);
D = STORE C INTO '/Users/yanglintong/7250/finalProject/PIG/Output/mostReviewed.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS'); 