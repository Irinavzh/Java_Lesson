package lesson12;

public class Algorithm {

    public boolean palindrome(String text) {

        char[] array = text.toCharArray();
        char storage;

        for(int i = 0; i < array.length/2; i++) {
           storage = array[i];
           array[i] = array[array.length - 1 - i];
           array[array.length - 1 - i] = storage;
        }
        String text1 = new String(array);
        if (text1.equals(text)) {
            return true;
        } else {
            return false;
        }
        }

    }

