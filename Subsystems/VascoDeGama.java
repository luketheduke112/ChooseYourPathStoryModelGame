/**
 * MicroStory
 */
/********************************************************************************************* 
 * PROBLEMS
 * TODO: Make it so that each scenario can sort through what to display in what order.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*************************************************************************************************/

import java.util.ArrayList;

public class VascoDeGama {
    public static Boolean testingMode = true;
   //LIST OF OPTIONS
   public static ArrayList<IndividualOption> optionsArry = new ArrayList<IndividualOption>();
   public static ArrayList<IndividualStoryContent> storyContentArry = new ArrayList<IndividualStoryContent>();
   public static ArrayList<IndividualScenario> scenariosArry = new ArrayList<IndividualScenario>();

   //this method pairs up options and story content with the right scenes.
   public static void addOptionsAndStoryToScenario(IndividualScenario scene, ArrayList<IndividualOption> optionToAdd, ArrayList<IndividualStoryContent> storyToAdd){
        for(int i = 0; i< optionsArry.size(); i++) {
            if(optionsArry.get(i).scenarioTitle.equals(scene.scenarioTitleParent)) {
                scene.options.add(optionToAdd.get(i));
            }
        }
        for(int i = 0; i< storyContentArry.size(); i++) {
            if(storyContentArry.get(i).scenarioTitle.equals(scene.scenarioTitleParent)) {
                scene.storyBlurbs.add(storyToAdd.get(i));
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


        //add story text here:
        IndividualStoryContent storyContent1 = new IndividualStoryContent("this is main story content yeet", "scene1");
        IndividualStoryContent storyContent2 = new IndividualStoryContent("this is main story content yeet #1", "scene1");
        IndividualStoryContent storyContent3 = new IndividualStoryContent("this is main story content yeet #2", "scene1");

        //add those stories to the array
        storyContentArry.add(storyContent1);
        storyContentArry.add(storyContent2);
        storyContentArry.add(storyContent3);
        
        //add scenarios here
        IndividualScenario scene1 = new IndividualScenario("scene1");
            scenariosArry.add(scene1);
        IndividualScenario scene2 = new IndividualScenario("scene2");
            scenariosArry.add(scene2);
        IndividualScenario scene3 = new IndividualScenario("scene3");
            scenariosArry.add(scene3);

        addOptionsAndStoryToScenario(scene1,optionsArry,storyContentArry);
        optionsArry.get(0).printOption();
       
        //Testing Chunk. Ignore or look at the bool on line 21 and change that to view diagnostics.
        if(testingMode == false) {
            System.out.println("There are: " + scenariosArry.size() + " objects in the Scenarios Array");
            System.out.println("Options Count for scene: " + scene1.options.size());
            System.out.println("Story Blurbs Count for scene: " + scene1.storyBlurbs.size());
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