REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/json-simple-1.1.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/google-collections-1.0.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-hadoop-compat-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-core-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-pig-4.9.jar

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ((float)$0#'stars' > 3);
C = GROUP B BY $0#'state';
D = FOREACH C GENERATE group, COUNT(B);
E = STORE D INTO '/Users/yanglintong/7250/finalProject/PIG/Output/BusinessNumInStateAboveAverage.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',', 'NO_MULTILINE', 'WINDOWS');