<<<<<<< HEAD:src/main/java/com/techprimers/testing/FizzBuzz.java
<<<<<<< HEAD
package com.harpeet.testing;
=======
package com.harpreet.testing;
>>>>>>> 35eb42e5bd29a66e211a8190bdf7739bbff7a46f
=======
package com.harpreet.testing;
>>>>>>> dev:src/main/java/com/harpreet/testing/FizzBuzz.java

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
}
