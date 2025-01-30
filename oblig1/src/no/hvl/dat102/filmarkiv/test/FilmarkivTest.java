package no.hvl.dat102.filmarkiv.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.filmarkiv.impl.Film;
import no.hvl.dat102.filmarkiv.impl.Filmarkiv;
import no.hvl.dat102.filmarkiv.impl.Sjanger;

import no.hvl.dat102.filmarkiv.impl.Filmarkiv2;

class FilmarkivTest {

	private Filmarkiv arkiv;

	   @BeforeEach
	    void setup() {
	        arkiv = new Filmarkiv(10);
	        arkiv.leggTilFilm(new Film(1, "James Cameron", "Avatar", 2009, Sjanger.SCIFI, "20th Century"));
	    }

	    @Test
	    void testFinnFilm() {
	        assertNotNull(arkiv.finnFilm(1));
	        assertNull(arkiv.finnFilm(99));
	    }

	    @Test
	    void testSlettFilm() {
	        assertTrue(arkiv.slettFilm(1));
	        assertFalse(arkiv.slettFilm(99));
	    }
	}
