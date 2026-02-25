
Feature: login info
Background: launching facebook page
Given launch facebook page "https://www.facebook.com/"
@map
Scenario: facebook login using map
When Logging into the facebook by one map
|First name|sowmiya|
|Surname|baskaran|
|dob|17-June-1997|
|Gender|Female|
|email|sowmiya1997b@gmail.com|
|password|Wel238|
When Taking screenshot of the page
@scenario1
Scenario:facebook login using list
When Logging into the facebook by one dim list
|sowmiya|
|baskaran|
|17-June-1997|
|Female|
|sowmiya1997b@gmail.com|
|Wel238|
When Taking screenshot of the page2

@scenario1
Scenario Outline: Bulking data 
When Logging into the facebook with bunch of data enters "<fname>" "<lname>" "<dob>" "<gender>" "<email>" "<pass>"
When Taking screenshot of the page3
Examples:
|fname|lname|dob|gender|email|pass|
|sowmiya|baskaran|17-June-1997|Female|sowmiya1997b@gmail.com|Wel238|
|mohan|	balan|03-July-1995|	Male|mohanbalan95@gmail.com|Immohan95|
|maaran|mohan|05-11-2019|Male|saielamara19@gmail.com|maarAn19|

					
