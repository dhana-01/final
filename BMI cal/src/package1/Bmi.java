package package1;

import java.time.Year;

/**
 *
 * @author USER
 */
public class Bmi {

    int id;
    String name;
    String yob;
    int height;
    int weight;

    double bmi;
    String category;
    String recommendation;
    int age;

    /**
     *
     * @param id
     * @param name
     * @param yob
     * @param height
     * @param weight
     */
    public Bmi(int id, String name, String yob, int height, int weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = height;
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getYob() {
        return yob;
    }

    /**
     *
     * @param yob
     */
    public void setYob(String yob) {
        this.yob = yob;
    }

    /**
     *
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public double getBmi() {
        return bmi;
    }

    /**
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        age = Year.now().getValue() - Integer.parseInt(yob);
        return age;
    }

    /**
     *
     * @return
     */
    public String getRecommendation() {
        return recommendation;
    }

    /**
     *
     */
    public void calculate() {
        double heightInM = this.height / 100;
        double heightSq = heightInM * heightInM;
        this.bmi = this.weight / heightSq;
    }

    /**
     *
     */
    public void display() {

        if (bmi < 16) {
            category = "Severe undernourishment";
            recommendation = "you need Immediate medical attention and nutritional support";
        } else if (bmi > 16 && bmi < 16.9) {
            category = "Medium undernourishment";
            recommendation = "you need balanced diet rich in nutrients, supplemented with regular meals and hydration";
        } else if (bmi > 17 && bmi < 18.4) {
            category = "Slight undernourishment";
            recommendation = "focus on increasing nutrient-dense foods in your diet";
        } else if (bmi > 18.5 && bmi < 24.9) {
            category = "Normal nutrition state";
            recommendation = "continue to prioritize a balanced diet consisting";
        } else if (bmi > 25 && bmi < 29.9) {
            category = "Overweight";
            recommendation = "need regular physical activity and seeking support from healthcare professionals   ";
        } else if (bmi > 30 && bmi < 39.9) {
            category = "Obesity";
            recommendation = "do regular exercise and make behavioral changes";
        } else if (bmi > 40) {
            category = "Pathological obesity";
            recommendation = "seek immediate medical attention and guidance from healthcare professionals";
        }

        System.out.println("User Id :" + this.id);
        System.out.println("User Name :" + this.name);
//        System.out.println(" , User Year Of Birth :"+this.yob);
//        System.out.println(" , User Height :"+this.height);
//        System.out.println(" , User weight :"+this.weight);

        System.out.println("User Age :" + this.getAge());
        System.out.println("User BMI :" + this.height);
        System.out.println("User  BMI category is :" + this.weight);
        System.out.println("Recommendation :" + this.getRecommendation());

    }

}
