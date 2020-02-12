/**
 * Creator: Joel Giannelli
 */


import java.util.ArrayList;

//Add new commands as see fit
public class Commands {

    String command;

    public Commands(String command) {
        this.command = command.toLowerCase();
    }


    //distinct command to take out any duplicate definitions.
    public ArrayList<dataFile> distinct(ArrayList<dataFile> dataLoad) {
        ArrayList<dataFile> placeHolder = new ArrayList<dataFile>();

        dataFile enumHolder = null;
        int i = 0;
        for(dataFile data : dataLoad) {
            enumHolder = dataLoad.get(i);


            for(int j = 0; j < dataLoad.size(); j++) {
            if(enumHolder.getDefinition().equalsIgnoreCase(data.getDefinition()))  {
                placeHolder.add(enumHolder);

            } //end inner conditional

            }// end inner for
        i++;
        } //end for-each loop
        return placeHolder;
    }




}




