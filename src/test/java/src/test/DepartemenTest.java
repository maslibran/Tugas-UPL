package src.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.main.Departemen;
import src.main.Manager;

class DepartemenTest {
	// membuat instance manager
		Manager X = new Manager("Bambang");
		
		// membuat instance departemen
		Departemen A = new Departemen();
		Departemen B = new Departemen("Humas", X);
		
		@BeforeEach
		void setUp() {
			X.setDepartemen(B);
			A.setNama("Kominfo");
		}
		
		// ==== Unit Test Departemen ====
		
		@Test
		@DisplayName("Nama Departemen")
		void getNama() {
			assertEquals("Humas", B.getNama());
		}
		
		@Test
		@DisplayName("Detail Manager")
		void getDetailManager() {
			assertEquals("Nama : Bambang\nDepartemen : Humas", B.getDetailManager());
		}
		
		// ==== Unit Test Manager ====
		
		@Test
		@DisplayName("Nama Manager")
		void getNamaManager() {
			assertEquals("Bambang", X.getNama());
		}
		
		@Test
		@DisplayName("Nama departemen dari Manager")
		void getNamaDepartemen() {
			assertEquals("Humas", X.getNamaDepartemen());
		}
}
