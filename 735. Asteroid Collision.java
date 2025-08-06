/**
735. Asteroid Collision

We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.
For each asteroid absolute value represents its size, the sign represents its direction (positive = right, negative = left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. 
If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
**/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for(int a: asteroids){
            boolean destroyed = false;

            while(!s.isEmpty() && a<0 && s.peek() > 0){
                if(s.peek() > -a){ //incoming a destroyed
                    destroyed=true;
                    break;
                }else if(s.peek() < -a){ // stack ele destroyed
                    s.pop();
                }else{                      //both destroyed
                    destroyed = true;
                    s.pop();
                    break;
                }
            }

            if(!destroyed){
                s.push(a);
            }
        } 

        int[] res = new int[s.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = s.pop(); // Reverse stack to array
        }
        return res;
    }
}
