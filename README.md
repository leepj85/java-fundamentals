# Java Fundamentals

This repo holds the first ten Java labs for Code Fellows 401.

## Lab 1: Java Primitives and Control Flow
### List of Methods
* pluralize
* flipNHeads
* clock

### Resources
* https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
* https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html

## Lab 2: Arrays, for loops, imports, ArrayLists
### List of Methods
* roll
* containsDuplicates
* calculateAvg
* calcArrayofArrayAvg

### Resources
* https://stackoverflow.com/questions/3457941/using-assertarrayequals-in-unit-tests
* https://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats

## Lab 3: Maps, File I/O, and Testing
### List of Methods
**basicslibrary**
* analyzeWeatherData
* tallyElection

**linter**
* jSLinter

### Resources
* https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
* https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
* https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

## Lab 6: Composition and Inheritance, Part 1
### List of Methods
**Restaurant**
* Restaurant
* addReview
* updateStarRating
* toString

**Review**
* Review
* toString

### Resources
* https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
* https://www.javatpoint.com/java-string-format
* https://www.yelp.com/biz/din-tai-fung-bellevue-4?frvs=True&osq=Restaurants+-+Reservations

## Lab 7: Composition and Inheritance, Part 2

### List of Methods
**Business**
* Business(String name, double starRating)
* addReview(Review review)
* updateStarRating()
* getName()
* getStarRating() 
* getReviews() 
* toString()

**Restaurant**
* Restaurant(String name, String price)
* toString()

**Shop**
* Shop(String name, String price, String description)
* toString()

**Theater**
* Theater(String name, double starRating)
* getMovieList()
* addMovie(String movie)
* removeMovie(String movie)

**Review**
* Review(String author, int starRating, String review, Business business)
* Review(String author, int starRating, String review, Business business, String movie)
* toString()

### Lab 9
### List of Methods
* getStarWarsQuote(String starWarsUrl)
* writeToFile(StarWarsQuote q)
* read(String s)
* getFileQuote(String filePath)

#### How to Test
* Check resource 'starwars-quotes.json' is empty and run AppTest.
* 'starwars-quotes.json' should now have 1 StarWarsQuote json object. 
* To test local quotes path works, please go into App.java and in Main, modify getStarWarsQuote String argument to result in bad path. 
  * Then run App and quote will be printed in console. 

### Lab 11
### List of Methods
* getRoot()
* getCapitalizedVariable(@PathVariable String variable, Model m)
* reverse(@RequestParam(required=true) String sentence, Model m)
* reverseString(String variable)

### How to Test
* Run HomeControllerTest in 'src/test'to test reverseString method. 
