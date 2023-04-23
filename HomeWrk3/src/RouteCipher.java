import java.util.Arrays;

public class RouteCipher {

    private int key;

    public RouteCipher(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String encrypt(String plainText) {
        char[] onlyLetters = getOnlyLetters(plainText);
        int textSize = onlyLetters.length;
        int columns = Math.abs(key);
        int rows = (textSize + columns - 1) / columns;
        char[][] textBlock = new char[rows][columns];
        int textIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                textBlock[i][j] = (textIndex < textSize) ? onlyLetters[textIndex++] : 'X';
            }
        }
        StringBuilder encryptedText = new StringBuilder();
        int allElementsInMatrix = rows * columns;
        int countElements = 0;
        if (key > 0) {
            for (int minRow = 0, minCol = 0, maxRow = rows - 1, maxCol = columns - 1;
                 countElements < allElementsInMatrix;) {
                for (int i = minRow; i <= maxRow && countElements < allElementsInMatrix; i++) {
                    encryptedText.append(textBlock[i][minCol]);
                    countElements++;
                }
                minCol++;
                for (int i = minCol; i <= maxCol && countElements < allElementsInMatrix; i++) {
                    encryptedText.append(textBlock[maxRow][i]);
                    countElements++;
                }
                maxRow--;
                for (int i = maxRow; i >= minRow && countElements < allElementsInMatrix; i--) {
                    encryptedText.append(textBlock[i][maxCol]);
                    countElements++;
                }
                maxCol--;
                for (int i = maxCol; i >= minCol && countElements < allElementsInMatrix; i--) {
                    encryptedText.append(textBlock[minRow][i]);
                    countElements++;
                }
                minRow++;
            }
        } else {
            for (int minRow = 0, minCol = 0, maxRow = rows, maxCol = columns;
                 minRow < maxRow && minCol < maxCol && countElements < allElementsInMatrix;) {
                for (int i = maxRow - 1; i >= minRow && countElements < allElementsInMatrix; i--) {
                    encryptedText.append(textBlock[i][maxCol - 1]);
                    countElements++;
                }
                maxCol--;
                for (int i = maxCol - 1; i >= minCol && countElements < allElementsInMatrix; i--) {
                    encryptedText.append(textBlock[minRow][i]);
                    countElements++;
                }
                minRow++;
                for (int i = minRow; i < maxRow && countElements < allElementsInMatrix; i++) {
                    encryptedText.append(textBlock[i][minCol]);
                    countElements++;
                }
                minCol++;
                for (int i = minCol; i < maxCol && countElements < allElementsInMatrix; i++) {
                    encryptedText.append(textBlock[maxRow - 1][i]);
                    countElements++;
                }
                maxRow--;
            }
        }
        return encryptedText.toString();
    }
    private char[] getOnlyLetters(String plainText){

        String temp = "";
        for(int i = 0; i < plainText.length(); i++){
            if((plainText.charAt(i) >= 'A' && plainText.charAt(i) <= 'Z') || (plainText.charAt(i) >= 'a' && plainText.charAt(i) <= 'z')){
                temp += plainText.charAt(i);
            }
        }
        temp.toUpperCase();
        char[] toReturn = temp.toCharArray();
        return toReturn;
    }

    public String decrypt(String cipherText){

        //absolute value defines the number of the columns
        int columns = Math.abs(key);
        int rows;

        //create new char array and then put only letters from plain text
        char[] onlyLetters = getOnlyLetters(cipherText);

        //we get the size of the text to determine the size of the text block
        int textSize = onlyLetters.length;


        if(textSize % columns == 0){
            rows = textSize / columns;
        }
        else{
            rows = (textSize / columns) + 1;
        }
        //a variable to iterate a cipher text
        int textIndex = 0;

        char[][] cipherTextMatrix = new char[rows][columns];

        String decryptedText = "";
        int minRow = 0, minCol = 0;
        int allElementsInMatrix = rows * columns;
        int countElements = 0;


        int rowS = rows;
        int colS = columns;

        if(key > 0) {

            while (minRow < rows && minCol < columns) {
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = minRow; i < rows; i++) {
                    cipherTextMatrix[i][minCol] = onlyLetters[countElements];
                    countElements++;
                }
                minCol++;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = minCol; i < columns; i++) {
                    cipherTextMatrix[rows - 1][i] = onlyLetters[countElements];
                    countElements++;
                }
                rows--;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = rows - 1; i >= minRow; i--) {
                    cipherTextMatrix[i][columns - 1] = onlyLetters[countElements];
                    countElements++;
                }
                columns--;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = columns - 1; i >= minCol; i--) {
                    cipherTextMatrix[minRow][i] = onlyLetters[countElements];
                    countElements++;
                }
                minRow++;
            }
        }
        else {
            while (minRow < rows && minCol < columns) {
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = rows - 1; i >= minRow; i--) {
                    cipherTextMatrix[i][columns - 1] = onlyLetters[countElements];
                    countElements++;
                }
                columns--;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = columns - 1; i >= minCol; i--) {
                    cipherTextMatrix[minRow][i] = onlyLetters[countElements];
                    countElements++;
                }
                minRow++;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = minRow; i < rows; i++) {
                    cipherTextMatrix[i][minCol] = onlyLetters[countElements];
                    countElements++;
                }
                minCol++;
                if (countElements == allElementsInMatrix) {
                    break;
                }
                for (int i = minCol; i < columns; i++) {
                    cipherTextMatrix[rows - 1][i] = onlyLetters[countElements];
                    countElements++;
                }
                rows--;
            }
        }

        for(int i = 0; i < rowS; i++){
            for(int j = 0; j < colS; j++) {
                decryptedText += cipherTextMatrix[i][j];
            }
        }

        return decryptedText;
    }

    public String toString(){

        return String.format("Route Cipher key = %d", key);
    }

}