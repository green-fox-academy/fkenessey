//Q1 Find the titles of all movies directed by Steven Spielberg.

SELECT title FROM Movie
WHERE director LIKE "Steven Spielberg";

//Q2 Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order. 

SELECT DISTINCT year FROM Movie 
INNER JOIN Rating ON Movie.mID = Rating.mID
WHERE stars BETWEEN 4 AND 5;

//Q3 Find the titles of all movies that have no ratings. 

SELECT title FROM Movie
LEFT JOIN Rating ON Movie.mID = Rating.mID
WHERE stars IS NULL;

//Q4 Some reviewers didn't provide a date with their rating. Find the names of all reviewers who have ratings with a NULL value for the date. 

SELECT name FROM Rating
LEFT JOIN Reviewer ON Rating.rID = Reviewer.rID
WHERE ratingDate IS NULL;

//Q5 Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate. Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars. 

SELECT name, title, stars, ratingDate FROM Rating
INNER JOIN Movie ON Rating.mID = Movie.mID
INNER JOIN Reviewer ON Rating.rID = Reviewer.rID
ORDER BY name ASC, title ASC, stars ASC;

//Q6 For all cases where the same reviewer rated the same movie twice and gave it a higher rating the second time, return the reviewer's name and the title of the movie. 

SELECT name, title FROM Rating AS r1
LEFT JOIN Rating AS r2 ON r1.rID = r2.rID
LEFT JOIN Movie ON r2.mID = Movie.mID
LEFT JOIN Reviewer ON r2.rID = Reviewer.rID
WHERE r1.mID = r2.mID AND r1.ratingDate > r2.ratingDate AND r1.stars > r2.stars;

//Q7 For each movie that has at least one rating, find the highest number of stars that movie received. Return the movie title and number of stars. Sort by movie title. 

SELECT DISTINCT title, MAX(stars) FROM Rating 
LEFT JOIN Movie ON Rating.mID = Movie.mID
LEFT JOIN Reviewer ON Rating.rID = Reviewer.rID
GROUP BY title;

//Q8 For each movie, return the title and the 'rating spread', that is, the difference between highest and lowest ratings given to that movie. Sort by rating spread from highest to lowest, then by movie title. 

SELECT title, MAX(stars) - MIN(stars) AS rating_spread FROM Rating
LEFT JOIN Movie ON Rating.mID = Movie.mID
GROUP BY Movie.mID
ORDER BY rating_spread DESC, title ASC;

//Q9 Find the difference between the average rating of movies released before 1980 and the average rating of movies released after 1980. (Make sure to calculate the average rating for each movie, then the average of those averages for movies before 1980 and movies after. Don't just calculate the overall average rating before and after 1980.) 

SELECT (before1980.before1980.average_rating_before1980 - after1980.after1980.average_rating_after1980) AS average_difference FROM (

SELECT AVG(before1980.average_rating_per_movie) AS average_rating_before1980 FROM (

    SELECT Movie.year, AVG(Rating.stars) AS average_rating_per_movie FROM Rating
        LEFT JOIN Movie ON Rating.mID = Movie.mID
        GROUP BY Movie.mID ) AS before1980
        
    WHERE before1980.year < 1980 ) AS before1980
 
 LEFT JOIN (
   
 SELECT AVG(after1980.average_rating_per_movie) AS average_rating_after1980 FROM (
 
   SELECT Movie.year, AVG(Rating.stars) AS average_rating_per_movie FROM Rating
        LEFT JOIN Movie ON Rating.mID = Movie.mID
        GROUP BY Movie.mID ) AS after1980
        
   WHERE after1980.year < 1980 ) AS after1980;