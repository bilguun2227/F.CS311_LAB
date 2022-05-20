package lab4;


import org.junit.Assert;
import org.junit.Test;

public class GradeManagerTest {
	//Дүн зөв орж байгаа эсхийг шалгах
	@Test
	public void addGrade() {
		GradeManager gr = new GradeManager();
		try {
			gr.addGrade("a");
			gr.addGrade("b");
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		Assert.assertEquals(1, (int) gr.getAllGrades().get(LetterGrade.A));
		Assert.assertNotEquals(2, (int) gr.getAllGrades().get(LetterGrade.B));
	}
}

