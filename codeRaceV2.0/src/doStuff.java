
import java.util.*;

/**
 *
 * @author SoloCode JSHDVR
 */
public class doStuff {
    private final String vision = "By 2025, the College envisions to be a premier local institution of higher leaening in Region 3 committed to the hollistic development of the human person and society.";
    private final String mission = "To produce well-trained,skilled,dynamic, and competitive individuals imbued with values and attitudes responsive to the changing needs of the local, national and global communities.";
    private final String stringG1 = "Provide opportunities that will enable individuals to acquire a high level of professional, technical and vocational courses of studies.";
    private final String stringG2 = "Develop innovative programs, projects and models of practice by undertaking research and studies.";
    private final String stringG3 = "Promote community development through relevant extension programs.";
    private final String stringG4 = "Provide opportunities for entrepreneurship and employability of graduates.";
    private final String visionCCS = "The College of Computer Studies Shall be a center of excellence in Information Technology and Computer Science for providing professional and technological training, scientific and innovative research and relevant community service.";
    private final String missionCCS = "The College of Computer Studies shall produce Information Technology and Computer Science professionals equipped with knowledge, skills, strong moral values, well-develop personality and exceptional abilities, thus becoming the preferred and prestigious source of services and manpower.";
    private final char[] visionChar = vision.toCharArray();
    private final char[] missionChar = mission.toCharArray();
    private final char[] goal1Char = stringG1.toCharArray();
    private final char[] goal2Char = stringG2.toCharArray();
    private final char[] goal3Char = stringG3.toCharArray();
    private final char[] goal4Char = stringG4.toCharArray();
    private final char[] CCSvisionChar = visionCCS.toCharArray();
    private final char[] CCSmissionChar = missionCCS.toCharArray();
    private String xasd;
    public String getXasd() {
        return xasd;
    }
    public void setXasd(String xasd) {
        this.xasd = xasd;
    }
    private final String[] arrChoice = {"",vision,mission,stringG1,stringG2,stringG3,stringG4,visionCCS,missionCCS};
    public String getArrChoice(int i) {
        return arrChoice[i];
    }
    static int score;
    private int size;
    private String choice,input;
    private String checkedAnswer="";
    public String accuracy;
    public String getAccuracy() {
        return accuracy;
    }
     public void setAccuracy() {
            double x =(double)getScore();
            double y =(double)getSize();
            double result = x/y;
            result = result*100;
        this.accuracy = String.valueOf((int)result);
    }
    public void strCompare(){
        if (getInput().length()<=getArrChoice(getRandomNum()).length()) {
            notGreaterThanChoice();
        } else {
            isGreaterThanChoice();
        }
    }
    private int firstRand;
    public int getFirstRand() {
        return firstRand;
    }
    public void setFirstRand(int firstRand) {
        this.firstRand = firstRand;
    }
    public int getSecondRand() {
        return secondRand;
    }
    public void setSecondRand(int secondRand) {
        this.secondRand = secondRand;
    }
    private int secondRand;
    private void randomize() {
        getRandomNum();
    }
    public int randomPick;
    public int getRandomNum(){
        return randomPick;
}
    public int setRandomNum() {
        int maxValue = 7;
        int random = 0;
        while (true) {
            random = (int) (Math.random() * (maxValue + 1));
            break;
    }
    return randomPick = random+1;
}
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        if(score!=0){
        doStuff.score += score;
        }else{
        doStuff.score = 0;
        }
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getChoice() {
        return choice;
    }
    public void setChoice(String choice) {
        this.choice = choice;
    }
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getCheckedAnswer() {
        return checkedAnswer;
    }
    public void setCheckedAnswer(String checkedAnswer) {
        this.checkedAnswer = checkedAnswer;
    }
    public String compared(){
        return null;
}
    private void notGreaterThanChoice() {
        char[] choiceArray = getArrChoice(getRandomNum()).toCharArray();
        char[] inputArray = getInput().toCharArray();
        int inputLength = getInput().length(),arrayChoice = getArrChoice(getRandomNum()).length(), y = 0;
        String x = "";
        StringBuilder sb = new StringBuilder();
        
                
                sb.append("<HTML><p ALIGN=CENTER - >");
                getArrChoice(getRandomNum());
            if (inputLength<=arrayChoice) {
                for (int i = 0; i < input.length(); i++) {
                    System.out.print("first for if lenght is < choidce");

                        if (inputArray[i]==choiceArray[i]) {
                            System.out.println(inputArray[i]);
                            System.out.println(choiceArray[i]);
                            sb.append("<font color=\"green\">");
                            sb.append(inputArray[i]);
                            y++;
                            System.out.println("if correct");
                        }else{
                            sb.append("<font color=\"red\">");
                            sb.append(inputArray[i]);
                            System.out.print("if wrong");
                        }
                    }x = "</font></p></HTML>";
            } else if(inputLength>arrayChoice){ 
                int counter = 0;
                for (int i = 0; i < arrayChoice; i++) {
                    System.out.print("first for if lenght is < choidce");
                        counter++;
                        if (inputArray[i]==choiceArray[i]) {
                            System.out.println(inputArray[i]);
                            System.out.println(choiceArray[i]);
                            sb.append("<font color=\"green\">");
                            sb.append(inputArray[i]);

                            y++;
                            System.out.println("if correct");
                        }else{
                            sb.append("<font color=\"red\">");
                            sb.append(inputArray[i]);
                            System.out.print("if wrong");
                        }
            }   
                    for (int i = counter; i < input.length(); i++) {
                        sb.append("<font color=\"gray\">");
                        sb.append(inputArray[i]);
                        
                    }
                    
                    
                }
                doStuff.score = y;
                System.out.println("end of the loop if legnt is < choice");
                    System.out.println(doStuff.score);
                    setCheckedAnswer(sb.toString()+x);        
                    System.out.println(getCheckedAnswer());
    }
    private void isGreaterThanChoice() {
        notGreaterThanChoice();
    }
}
 