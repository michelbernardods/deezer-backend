
<h1 align="center">
   Deezer
</h1>


<h4 align="center">
  ☕ Code and coffee
</h4>

## 💻 Project

Create a search page where we can search for the artist's name.

All queries will be saved in the database to generate statistics.

To display the records, a REST API must be created which will return the following fields in JSON format:  
   - Name searched;
   - Date and time of the survey in the format 00/00/0000 00:00:00 (DD / MM / YYYY HH: MM: SS)
   
Desired features:

All information will be obtained through the Deezer public API: https://api.deezer.com/search/?q=linkinpark
- The names of the songs should appear, separated by album;
- Open the music page by clicking on it;
- Allow sorting by album and ranking;
- Responsive page;
- All searches must be saved in the database;

-> Backend : Java 
-> Frontend : PostgresSql


# Requirements 

To access the database, you need to install Postgresql:
https://www.postgresql.org/download/

To access the Front end you need to download the repository:
https://github.com/michelbernardods/deezer-frontend

##### OBS: Very important to start the backend before the frontend!


# Start the backend 

- Import the .zip file into Java.
- Run As -> Java Application.
- Start Postgresql with PgAdmin 

##### Create a table with the name written in the file (aplication.properties)
##### If your Postgresql is running on port 5432 you need to change it in the file (aplication.properties)



#### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).

### 💻 Preview

<h1 align="center">
    <img alt="Be The Hero" src="https://github.com/michelbernardods/deezer-frontend/blob/master/1.png"  />
    <img alt="Be The Hero" src="https://github.com/michelbernardods/deezer-frontend/blob/master/2.png"  />
    <img alt="Be The Hero" src="https://github.com/michelbernardods/deezer-frontend/blob/master/4.png"  />
    <img alt="Be The Hero" src="https://github.com/michelbernardods/deezer-frontend/blob/master/3.png"  />
</h1>


