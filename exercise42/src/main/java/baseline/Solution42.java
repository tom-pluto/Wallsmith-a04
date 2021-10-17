/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Constraints:
    >   Write your own code to parse the data. Don't use a CSV parser.
 */

package baseline;

import java.io.File;
import java.nio.file.Paths;

public class Solution42 {

    public static void main(String[] args) {

        File csvInput = new File(Paths.get("data/exercise42_input.txt").toUri());

        PersonLister personLister = new PersonLister();
        personLister.createPersonList(csvInput);
        System.out.printf("%s", personLister.getPersonListAsOutputString());

    }

}
