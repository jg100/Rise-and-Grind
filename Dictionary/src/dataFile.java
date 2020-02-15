//searchable word

/**
 * Creator: Joel Giannelli
 */
    public enum dataFile {
        //Predefined instances

    ARROW1("Arrow", "noun", "Here is one arrow: <IMG> -=>> </IMG>"),

    DISTINCT1("Distinct", "adjective", "Familiar. Worked in Java"),
    DISTINCT2("Distinct", "adjective", "Unique. No Duplicates. Clearly different or of a different kind."),
    DISTINCT3("Distinct", "adverb", "Uniquely. Written \"distinctly\"."),
    DISTINCT4("Distinct", "noun", "A keyword in this assignment."),
    DISTINCT5("Distinct", "noun", "A keyword in this assignment."),
    DISTINCT6("Distinct", "noun", "A keyword in this assignment."),
    DISTINCT7("Distinct", "noun", "An advanced search option."),
    DISTINCT8("Distinct", "noun", "Distinct is a parameter in this assignment."),

    PLACEHOLDER1("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDER2("Placeholder", "adjective" , "To be updated..."),
    PLACEHOLDER3("Placeholder", "adverb" , "To be updated..."),
    PLACEHOLDER4("Placeholder", "conjunction" , "To be updated..."),
    PLACEHOLDER5("Placeholder", "interjection" , "To be updated..."),
    PLACEHOLDER6("Placeholder", "noun" , "To be updated..."),
    PLACEHOLDER7("Placeholder", "noun" , "To be updated..."),
    PLACEHOLDER8("Placeholder", "noun" , "To be updated..."),
    PLACEHOLDER9("Placeholder", "preposition" , "To be updated..."),
    PLACEHOLDER10("Placeholder", "pronoun" , "To be updated..."),
    PLACEHOLDER11("Placeholder", "verb" , "To be updated..."),

    CSC340_1("CSC340", "adjective", "C++ version of CSC210 + CSC220 + more."),
    CSC340_2("CSC340", "noun", "A CS upper division course."),
    CSC340_3("CSC340", "noun", "Many hours outside of class."),
    CSC340_4("CSC340", "noun", "Programing Methodology."),

    CSC220_1("CSC220", "adjective", "Ready to create complex data structures."),
    CSC220_2("CSC220", "verb", "To create data structures."),

    BOOK1("Book", "noun", "A set of pages."),
    BOOK2("Book", "noun", "A written work published in printed or electronic form."),
    BOOK3("Book", "verb", "To arrange for someone to have a seat on a plane."),
    BOOK4("Book", "verb", "To arrange something on a particular date."),

    ADVERB1("Adverb", "noun", "Adverb is a word that adds more information about place, time, manner, cause or degree to a verb, an adjective, a phrase or another adverb."),

    ADJECTIVE1("Adjective", "noun", "Adjective is a word that describes a person or thing, for example big, red and clever in a big house, red wine and a clever idea."),

    //CONJUNCTION1(),

    INTERJECTION1("Interjection", "noun", "Interjection is a short sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections."),

    NOUN1("Noun", "noun", "Noun is a word that refers to a person, (such as Ann or doctor), a place (such as Paris or a city) or a thing, a quality or an activity (such as plant, sorrow, or tennis.");

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
