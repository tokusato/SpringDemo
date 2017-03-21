package procon.chap01;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoApplicationTest {


//	//戻り値のある関数をテストするときも テストメソッドはvoidの型にしてテストを実施する。
//	@Test
//	public void testAdd(int a, int b) {
//		//memo テスト時に作成(new)するインスタンスは、テスト対象クラスのインスタンス
//		//memo テストクラスは、実装クラスとパッケージが異なるため、アクセサを広く取らなくてはいけない??
//		//      ⇒リフレクションなどを用いて、privateのメソッドも検査できるはず。⇒要チェック
//		assertTrue(new DemoApplication().add(1,2) == 3);
//	}

	//memo 戻り値のある関数をテストするときも テストメソッドはvoidの型にしてテストを実施する。
	//memo メソッドの宣言の引数をなくせと言われたからなくしたが、これは本当にあっているのか??
	@Test
	public void testAdd() {
		//memo テスト時に作成(new)するインスタンスは、テスト対象クラスのインスタンス
		//memo テストクラスは、実装クラスとパッケージが異なるため、アクセサを広く取らなくてはいけない??
		//      ⇒リフレクションなどを用いて、privateのメソッドも検査できるはず。⇒要チェック
		assertTrue(new DemoApplication().add(1,2) == 3);
	}

}
