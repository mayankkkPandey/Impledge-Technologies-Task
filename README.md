# Impledge-Technologies-Task


### Longest Compounded Word Search

This Java program is designed to search for the longest compounded word in a given text or list of words. A compounded word is a word that can be formed by concatenating two or more smaller words that exist in the text or list.

### Approach to Finding the Longest Compounded Word 
Read and Parse Input:

If the input is a text file, read the contents of the file and split it into individual words.
If the input is a list of words separated by spaces, split them into individual words.
Sort Words by Length:

Sort the list of words in descending order of their lengths. This allows us to start with the longest words, which are more likely to be compounded.
Check Compounded Words:

For each word in the sorted list, check if it can be compounded from smaller words in the list.
To do this, start with the first character of the word and check if the substring from the beginning up to the current character is present in the list.
If a match is found, recursively check the remaining part of the word to see if it can be compounded as well.
Keep track of the longest compounded word found so far.
Output the Result:

Once all words have been checked, output the longest compounded word found.

#### Usage

1. Clone the repository to your local machine.

2. Build the Java application using the following command:

   ```shell
   javac LongestCompoundedWord.java
   ```

3. Run the application, providing a text or list of words as input:

   ```shell
   java LongestCompoundedWord "input.txt"
   ```

   You can also provide a list of words separated by spaces:

   ```shell
   java LongestCompoundedWord "word1 word2 word3"
   ```

4. The program will analyze the input and display the longest compounded word it finds in the text.

#### Example

Suppose you have an input file named "input.txt" with the following content:

```
apple banana orange applebanana dog cat
```

Running the program with this input:

```shell
java LongestCompoundedWord "input.txt"
```

The program will output:

```
Longest compounded word: applebanana (apple + banana)
```



Feel free to experiment with different inputs and texts to find the longest compounded words in your own data.

For more details on how the program works and the Java code behind it, please refer to the source code and documentation in this repository.

``` 

Customize the usage and example sections based on the specifics of your Java code for searching the longest compounded word in the given question.
