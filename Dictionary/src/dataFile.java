//searchable word

/**
 * Creator: Joel Giannelli
 */
    public enum dataFile {
        //Predefined instances
        DISTINCT1("Distinct", "adjective", "Worked in Java"),
        DISTINCT2("Distinct", "adjective", "Unique. No Duplicates. Clearly different or of a different kind."),
        DISTINCT3("Distinct", "adverb", "Uniquely. Written \"Distinctly\" "),
        DISTINCT4("Distinct", "noun", "A keyword in this assignment"),
        DISTINCT5("Distinct", "noun", "Distinct is a parameter in this assignment"),

        CSC340_1("csc340", "adjective", "C++ version of CSC210 + CSC220 + more"),
        CSC340_2("csc340", "noun", "A CS upper division course"),
        CSC340_3("csc340", "noun", "Many hours outside of class"),
        CSC340_4("csc340", "noun", "Programing Methodology");

        /**
         * FILL IN REST OF DATA AS SOON AS FIRST PART IS WORKING
         */


        private String word;
        private String partOfSpeech;
        private String definition;

        dataFile(String word, String partOfSpeech, String definition) {
            this.word = word;
            this.partOfSpeech = partOfSpeech;
            this.definition = definition;
        }


        //Getter methods
        public String getWord() {
            return word;

        }

        public String getDefinition() {
            return definition;

        }

        public String getPartOfSpeech() {
            return partOfSpeech;
        }
        //end getter methods

    }


}

