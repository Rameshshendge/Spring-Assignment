package seventhassignment;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Demo {
	@Value("#{78+90-30}")
	private int x;
	@Value("#{99%2+10/2-2+10}")
	private int y;
	
	
	@Override
	public String toString() {
		return "SpELDemo [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}