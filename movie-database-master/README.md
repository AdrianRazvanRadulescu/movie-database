# Movie Database using Spring Boot

The application contains 5 classes: movies, screenwriters, actors, directors, genres.

Movie class containts the following fields: id, title, releaseDate, director, actorsList, genre, screenWriter.

ScreenWriter, Director and Actor Class contain the following fields: id, name, nationality, moviesList. Actor class also contains a field called age.

Genre Class contains two fields: genreType and id.


There is a one-to-many relationship between movies and screenwriters (one screenwriters -> multiple movies), directors, genres.

There is a many-to-many relationship between movies and actors (each actor can play in movies, each movie has multiple actors).
