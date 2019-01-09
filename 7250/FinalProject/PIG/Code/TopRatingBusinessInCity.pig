REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/json-simple-1.1.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/google-collections-1.0.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-hadoop-compat-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-core-4.9.jar
REGISTER /Users/yanglintong/7250/finalProject/PIG/Code/jar/elephant-bird-pig-4.9.jar

A = LOAD '/Users/yanglintong/7250/finalProject/dataset/yelp_academic_business.json' USING com.twitter.elephantbird.pig.load.JsonLoader('-nestedLoad=true') AS (map[]);
B = FILTER A BY ((float)$0#'stars' == 5);
C = FOREACH B GENERATE $0#'city', $0#'name';
Dump C; 
STORE C INTO 'TopRatingBusinessInCity' USING  PigStorage(':');