import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

    }

    //Logic 1
    public boolean love6(int a, int b) {
        boolean boolin = false;
        if (a == 6 || b == 6 ){
            boolin = true;
        } else if(b-a == 6 || a-b == 6 || a+b == 6){
            boolin = true;
        }
        return boolin;
    }

    //String 1
    public boolean hasBad(String str) {
        boolean boolin = false;
        if(str.length() < 4 && str != "bad"){
            return boolin;
        }
        if(str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")){
            boolin = true;
        }
        return boolin;
    }

    //String 2
    public boolean catDog(String str) {
        boolean boolin = false;
        int cC = 0;
        int dC = 0;
        if (str.length() < 3){
            return true;
        }
        for (int i = 0; i < str.length()-2;i++){
            if (str.substring(i,i+3).equals("cat")){
                cC += 1;
            }
        }
        for (int i = 0; i < str.length()-2;i++){
            if (str.substring(i,i+3).equals("dog")){
                dC += 1;
            }
        }
        if (dC == cC){
            boolin = true;
        }
        return boolin;
    }

    //Array 1
    public int[] makeEnds(int[] nums) {
        int[] retNums = {nums[0], nums[nums.length-1]};
        return retNums;
    }

    //Logic 2
    public int roundSum(int a, int b, int c) {
        a = ((a+5)/10)*10;
        b = ((b+5)/10)*10;
        c = ((c+5)/10)*10;
        return (a+b+c);
    }

    //String 3
    public boolean equalIsNot(String str) {
        boolean boolin = false;
        int iC = 0;
        int nC = 0;
        if (str.length() < 3){
            return true;
        }
        for (int i = 0; i < str.length()-1;i++){
            if (str.substring(i,i+2).equals("is")){
                iC += 1;
            }
        }
        for (int i = 0; i < str.length()-2;i++){
            if (str.substring(i,i+3).equals("not")){
                nC += 1;
            }
        }
        if (nC == iC){
            boolin = true;
        }
        return boolin;
    }

    //Array 2
    public int[] post4(int[] nums) {
        for (int i = nums.length-1;i > -1; i--){
            if (nums[i] == 4){
                return Arrays.copyOfRange(nums, i+1, nums.length);
            }
        }
        return null;
    }

    //Warmup 1
    public boolean or35(int n) {
        if (n%3==0||n%5==0){
            return true;
        }
        return false;
    }

    //Warmup 2
    public String altPairs(String str) {
        String str2 = "";
        int nm = 0;
        boolean tog = true;
        for (int i = 0; i < str.length();i++){
            if (tog == true){
                str2 += str.substring(i,i+1);
                nm += 1;
                if (nm > 1){
                    tog = false;
                }
            }else{
                nm -= 1;
                if (nm < 1){
                    tog = true;
                }
            }

        }
        return str2;
    }


    //Arrays 3
    public int[] fix45(int[] nums) {
        int aF = 0;
        for (int i = 0; i < nums.length-1;i++){
            if (nums[i] == 4 && nums[i+1] != 5 && i != nums.length-1){
                aF = nums[i+1];
                for (int x = 0; x < nums.length; x++){
                    if (x != 0){
                        if (nums[x] == 5 && nums[x-1] != 4) {
                            nums[x] = aF;
                            nums[i + 1] = 5;
                            break;
                        }
                    }else if (nums[x] == 5){
                        nums[x] = aF;
                        nums[i+1] = 5;
                        break;
                    }
                }
            }
        }
        return nums;
    }

}
