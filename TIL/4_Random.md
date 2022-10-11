랜덤 숫자 생성

```
import java.utill.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int rand = random.nextInt(10); //0~9 숫자
		int rand = random.nextInt(4) + 5; //5~9 숫자
	}
}
```