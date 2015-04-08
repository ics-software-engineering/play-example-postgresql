# play-example-postgresql

This application illustrates how to configure Play to access a PostgreSQL database.  The functionality is simple: the application creates a PostgreSQL table called `page_retrieval` containing two columns: an Id and a timestamp.  A new row is added to the database each time the home page of the application is retrieved.   Thus, the size of the table indicates the number of times the home page has been retrieved, and that value is printed to the home page each time it is accessed:

![screenshot](https://raw.githubusercontent.com/ics-software-engineering/play-example-postgres/master/doc/play-example-postgres-home-page.png)

Here are the steps required to run this application:


#### 1. Install PostgreSQL.

Download and install a local copy of [PostgreSQL](http://www.postgresql.org/).  This application was tested with Version 9.3 (since that is the current default version used by Heroku).  Later versions may still work.

To test that your installation was successful, you should be able to run psql from the command line and list the currently installed databases as follows:

```Shell
[~/]-> psql
psql (9.3.5)
Type "help" for help.

johnson=# \l
                                       List of databases
          Name           |  Owner  | Encoding |   Collate   |    Ctype    |  Access privileges  
-------------------------+---------+----------+-------------+-------------+---------------------
 johnson                 | johnson | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 postgres                | johnson | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 template0               | johnson | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/johnson         +
                         |         |          |             |             | johnson=CTc/johnson
 template1               | johnson | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/johnson         +
                         |         |          |             |             | johnson=CTc/johnson
(4 rows)

johnson=# \q
[~/]-> 
```



