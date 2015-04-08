# play-example-postgresql

This application illustrates how to use Play with the PostgreSQL database.  The functionality is simple: the application creates a PostgreSQL table called `page_retrieval` containing two columns: an Id and a timestamp.  A new row is added to the database each time the home page of the application is retrieved.   Thus, the size of the table indicates the number of times the home page has been retrieved, and that value is printed to the home page each time it is accessed:

![screenshot](https://raw.githubusercontent.com/ics-software-engineering/play-example-postgres/master/doc/play-example-postgres-home-page.png)



