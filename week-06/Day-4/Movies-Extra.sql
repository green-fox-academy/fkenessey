//Q1 Find the names of all reviewers who rated Gone with the Wind. 

SELECT DISTINCT Reviewer.name FROM Rating
LEFT JOIN Movie ON Rating.mID = Movie.mID
LEFT JOIN Reviewer ON Rating.rID = Reviewer.rID
WHERE Movie.title = "Gone with the Wind";

//Q2 For any rating where the reviewer is the same as the director of the movie, return the reviewer name, movie title, and number of stars. 

SELECT DISTINCT Reviewer.name, Movie.title, Rating.stars FROM Rating
LEFT JOIN Movie ON Rating.mID = Movie.mID
LEFT JOIN Reviewer ON Rating.rID = Reviewer.rID
WHERE Reviewer.name = Movie.director;

//Q3 Return all reviewer names and movie names together in a single list, alphabetized. (Sorting by the first name of the reviewer and first word in the title is fine; no need for special processing on last names or removing "The".) 

SELECT Reviewer.name FROM Reviewer
UNION
SELECT Movie.title FROM Movie;

//Q4 Find the titles of all movies not reviewed by Chris Jackson. 

SELECT DISTINCT Movie.title FROM Movie 
WHERE Movie.mID NOT IN ( 
SELECT DISTINCT Movie.mID FROM Rating
LEFT JOIN Movie ON Rating.mID = Movie.mID
LEFT JOIN Reviewer ON Rating.rID = Reviewer.rID
WHERE Reviewer.name = "Chris Jackson"
);

//Q5 For all pairs of reviewers such that both reviewers gave a rating to the same movie, return the names of both reviewers. Eliminate duplicates, don't pair reviewers with themselves, and include each pair only once. For each pair, return the names in the pair in alphabetical order.

SELECT DISTINCT re1.name, re2.name  FROM Rating AS r1
INNER JOIN Rating AS r2 ON r1.mID = r2.mID
INNER JOIN Reviewer AS re1 ON r1.rID = re1.rID
INNER JOIN Reviewer AS re2 ON r2.rID = re2.rID
WHERE re1.name < re2.name
ORDER BY re1.name ASC;

//Q6 For each rating that is the lowest (fewest stars) currently in the database, return the reviewer name, movie title, and number of stars. 

SELECT DISTINCT re1.name, m1.title, r1.stars FROM Rating AS r1
INNER JOIN Reviewer AS re1 ON r1.rID = re1.rID
INNER JOIN Movie AS m1 ON r1.mID = m1.mID
WHERE r1.stars = (SELECT MIN(Rating.stars) FROM Rating);

//Q7 List movie titles and average ratings, from highest-rated to lowest-rated. If two or more movies have the same average rating, list them in alphabetical order. 

SELECT Movie.title, AVG(Rating.stars) AS average_ratings FROM Rating
INNER JOIN Movie ON Rating.mID = Movie.mID
GROUP BY Movie.title
ORDER BY average_ratings DESC, Movie.title ASC;

//Q8 Find the names of all reviewers who have contributed three or more ratings. (As an extra challenge, try writing the query without HAVING or without COUNT.) 

SELECT DISTINCT re1.name FROM Rating AS r1
INNER JOIN Rating AS r2 ON r1.rID = r2.rID
INNER JOIN Rating AS r3 ON r1.rID = r3.rID
INNER JOIN Reviewer AS re1 ON r1.rID = re1.rID
INNER JOIN Reviewer AS re2 ON r2.rID = re2.rID
INNER JOIN Reviewer AS re3 ON r3.rID = re3.rID
WHERE r1.ratingDate != r2.ratingDate AND r2.ratingDate != r3.ratingDate AND r1.ratingDate != r3.ratingDate
ORDER BY re1.name ASC