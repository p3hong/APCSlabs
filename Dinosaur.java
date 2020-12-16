
/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int health;// a range between 0 - 100
    
    
    /**
     * Default constructor for objects of class Dinosaur
     */
    public Dinosaur()
    {
        this.type = "Dino";
        this.age = 0;
        // write code that will assign gender 50 50.
        
       
        this.health = 10;
    }
    
    /**
     * Explicit constructor for the Dino class.
     */
    public Dinosaur(String t)
    {
        this.type = t;
        this.age = 0;
        this.health = 10;
        // write code to set gender to m/f 50%.
        
    }
    
    /*********   Getters   *****************/
    // Getters return the private instance data.
    public String getType()
    {
        return this.type;
    }
    public int getHealth()
    {
        return this.health;
    }
    public String getGender()
    {
        return this.gender;
    }
    public int getAge()
    {
        return this.age;
    }
    //public int getHealth()
    /*********   Setters   *****************/
    public void setType(String t)
    {
        this.type = t;
    }
    public void setHealth(int h)
    {
        this.health = h;
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    
    public boolean equals(Dinosaur d)
    {
        int ageDiff = this.age - d.getAge();
        if (Math.abs(ageDiff)<10)
        {
            int healthDiff = this.health - d.getHealth();
            if (Math.abs(healthDiff) < 10)
            {
                if (this.type.equals(d.getType()))
                {
                     return true;
                }
            }
        }
        return false;
    }
    
    public void ageUp()
    {
        if(this.health>0)
        {
            this.age++;
            if (this.age<10)
            {
                this.health = this.health+10;
            }
            else if (this.age<25)
            {
                this.health = this.health;
            }  
            else if (this.age<=30)  
            {
                this.health = this.health-5;
            }  
            else
            {
                this.health = this.health-10;
            }  
        }
    }

    /**
     * Return this Dino as a string
     */
    public String toString()
    {
        String answer = this.type + " " + this.age + " " + this.health+ " "+this.gender;
        return answer;
    }
}