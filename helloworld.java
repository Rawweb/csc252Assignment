// DECLARE AND INITIALIZE AN ARRAY OF FRUITS
String[] fruits = {"Apple", "Banana", "Cherry", "Orange", "Mango"};


// DECLARE AND INITIALIZEA TWO-DIMENSIONAL ARRAY OF STUDENT NAMES
String[][] studentNames = {
    {"Kingsley", "Jane", "Fransisca"},
    {"Emily", "Mmesoma", "Neche"},
    {"Daniel", "Philomena", "Sarah"}
};


// TRANSVERSING THE FRUITS ARRAY USING A FOR LOOP
for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}

// TRANSVERSING THE STUDENT NAMES ARRAY USING A NESTED FOR LOOP
for (int i = 0; i < studentNames.length; i++) {
    for (int j = 0; j < studentNames[i].length; j++) {
        System.out.println(studentNames[i][j]);
    }
}


// CONCATENATE THE STRING OF FRUITS ARRAY
StringBuilder concatenatedFruits = new StringBuilder();
for (String fruit : fruits) {
    concatenatedFruits.append(fruit).append(" ");
}
System.out.println(concatenatedFruits.toString().trim());



// CONCATENATE THE STRING OF STUDENT NAMES ARRAY
StringBuilder concatenatedNames = new StringBuilder();
for (String[] row : studentNames) {
    for (String name : row) {
        concatenatedNames.append(name).append(" ");
    }
}
System.out.println(concatenatedNames.toString().trim());
