package ds;

public class TreeImpl {
  TreeImpl left;
  TreeImpl right;
  String data;
  
  /**
 * 
 */
public  TreeImpl() {
// TODO(abharti): Auto-generated constructor stub
}
public  TreeImpl(String data,TreeImpl left,TreeImpl right) {
  this.data = data;
  this.left = left;
  this.right = right;
}
/**
 * @return the left
 */
public TreeImpl getLeft() {
return left;}
/**
 * @param left the left to set
 */
public void setLeft(TreeImpl left) {
this.left = left;}
/**
 * @return the right
 */
public TreeImpl getRight() {
return right;}
/**
 * @param right the right to set
 */
public void setRight(TreeImpl right) {
this.right = right;}
/**
 * @return the data
 */
public String getData() {
return data;}
/**
 * @param data the data to set
 */
public void setData(String data) {
this.data = data;}
  
}
