package ApplicationContext;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware
{
 @Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", context=" + context
				+ "]";
	}

public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public Point getPointA() {
		return pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public Point getPointC() {
		return pointC;
	}

private Point pointA;
 private Point pointB;
 private Point pointC;
 private ApplicationContext context = null;
 
 /**
  * @param pointA the pointA to set
  */
 public void setPointA(Point pointA) {
  this.pointA = pointA;
 }

 /**
  * @param pointB the pointB to set
  */
 public void setPointB(Point pointB) {
  this.pointB = pointB;
 }

 /**
  * @param pointC the pointC to set
  */
 public void setPointC(Point pointC) {
  this.pointC = pointC;
 }

 public void draw()
 {
	 System.out.println("PointA is ("+pointA.getX()+", "+pointA.getY()+")");
	 System.out.println("PointB is ("+pointB.getX()+", "+pointB.getY()+")");
	 System.out.println("PointC is ("+pointC.getX()+", "+pointC.getY()+")");
	 
 }

public void setBeanName(String name) {
	// TODO Auto-generated method stub
	
}

public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	
}

public Triangle() {
	super();
	// TODO Auto-generated constructor stub
}

public Triangle(Point pointA, Point pointB, Point pointC, ApplicationContext context) {
	super();
	this.pointA = pointA;
	this.pointB = pointB;
	this.pointC = pointC;
	this.context = context;
}


}

