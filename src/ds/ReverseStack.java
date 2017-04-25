package ds;

import java.util.Enumeration;
import java.util.Stack;

public class ReverseStack {

  /**
   * @param args
   */
  public static Stack<Integer> stk = new Stack<Integer>();
  public static void main(String[] args) {
    stk.push(1);
    stk.push(2);
    stk.push(3);
    stk.push(4);
    stk.push(5);
    print( stk);
    reverse(stk);
    print( stk);
  }
  public static void reverse(Stack<Integer> stack){
    if(stack.isEmpty())
      return;
    int temp = remove();
    reverse(stack);
    bottomFill(temp,stack);
    
  }
  public static int  remove(){
    return stk.pop();
  }
  public static void bottomFill(int n,Stack<Integer> stack){
    if(stack.isEmpty())
      stack.push(n);
    else
    {
      int temp = stack.pop();
      
      bottomFill(n,stack);
      stack.push(temp);
    }
  }
  public static void print(Stack stk){
    Enumeration en =  stk.elements();
    while(en.hasMoreElements())
      System.out.println(en.nextElement());
  }

}
