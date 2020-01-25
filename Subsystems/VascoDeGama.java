/**
 * MicroStory
 */
import java.util.ArrayList;

public class VascoDeGama {
    public static Boolean testingMode = true;
   //LIST OF OPTIONS
   public static ArrayList<IndividualOption> optionsArry = new ArrayList<IndividualOption>();
   public static ArrayList<IndividualScenario> scenariosArry = new ArrayList<IndividualScenario>();

   public static void addOptionsToScenario(IndividualScenario scene, ArrayList<IndividualOption> optionToAdd){
        for(int i = 0; i< scene.optionCount; i++) {
          if(optionToAdd.get(i).scenarioTitle.equals(scene.scenarioTitleParent)) {
              scene.options.add(optionToAdd.get(i));
           }
        }
    }

    public static void main(String[] args) {
      
        //add options here
        IndividualOption option1 = new IndividualOption(1, "Hi there 1", false, "scene1");
        IndividualOption option2 = new IndividualOption(1, "Hi there 2", false, "scene1");
        IndividualOption option3 = new IndividualOption(1, "Hi there 3", false, "scene1");
        IndividualOption option4 = new IndividualOption(1, "Hi there 4", false, "scene1");
        

        //add those options to the Array
        optionsArry.add(option1);    
        optionsArry.add(option2);    
        optionsArry.add(option3);    
        optionsArry.add(option4);
        //add scenarios here
        IndividualScenario scene1 = new IndividualScenario("scene1", 4);
            scenariosArry.add(scene1);
        IndividualScenario scene2 = new IndividualScenario("scene2", 2);
            scenariosArry.add(scene2);
        IndividualScenario scene3 = new IndividualScenario("scene3", 2);
            scenariosArry.add(scene3);









        //add that option to arrayList
        


        addOptionsToScenario(scene1,optionsArry);
        optionsArry.get(0).printOption();
       
        //Testing Chunk
        if(testingMode == true) {
            System.out.println("There are: " + scenariosArry.size() + " objects in the Scenarios Array");
            System.out.println("Options Count for scene: " + scene1.optionCount);
            System.out.println("Options Array Size:" + optionsArry.size());
            System.out.println("Scene1 options array size:"+scene1.options.size());
            
            System.out.println(scene1.options.get(0).mainContent);
            System.out.println(scene1.options.get(1).mainContent);
            System.out.println(scene1.options.get(2).mainContent);
            System.out.println(scene1.options.get(3).mainContent);
        }
            
    }
  
    //LIST OF SCENARIOS

}