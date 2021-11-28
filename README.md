# rest-epg-service
Project for position as Software Engineer at TV2: Integration & Data Services

## Information
The project is written in Java using Spring 2.6 and utilizes the com.fasterxml.jackson.dataformat to format xml files directly into objects. 
The return type is JSON as the intended use for this is GUI and would allow the user more freedom of choice. 

## Guide
The same list as below can be found using nothing as input in the endpoint besides "/"

### List of endpoints:
-  /channels : brings up the channels.
-  /programguide : brings up the programs sent on a given channel on a given day. Takes two params:
   - ?channelid= : the ID of the channel wanted
   - &date= : The date the programs is aired
-  /program : holds multiple options. 
   - Default : writing nothing provides the whole list of programs.
   - ?program= : Write either the title or ext_id of program to provide the wanted show(s). using the name can bring up multiple shows
-  /serie : provides a given series wanted from the parent list:
   - ?serie= : Takes a name or id of the wanted series.
-  /serieslist : provides series from the serieslist; providing individuel series with additional information

## Additional information
The project is written in the IDE Intellij (Ultimate edition) and is testes using Postman as the client interacting with the service. 
