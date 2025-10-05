package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    
    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void equals_same_object() {
	Team t1 = new Team();
	t1.setName("foo");
	t1.addMember("bar");
	assert(t1.equals(t1));
    }

    @Test
    public void equals_different_object_same_values() {
	Team t1 = new Team();
	t1.setName("foo");
	t1.addMember("barty");
	t1.addMember("barty2");
	Team t2 = new Team();
	t2.setName("foo");
	t2.addMember("barty");
	t2.addMember("barty2");
	assert(t1.equals(t2));
    }

    @Test
    public void equals_different_object_same_values_empty_members() {
	Team t1 = new Team();
	t1.setName("foo");
	Team t2 = new Team();
	t2.setName("foo");
	assert(t1.equals(t2));
    }
    
    @Test
    public void equals_different_class() {
	Team t1 = new Team();
	t1.setName("foo");
	t1.addMember("bar");
	int a1 = 5;
	assert(t1.equals(a1) == false);
    }

    @Test
    public void equals_different_objects() {
	Team t1 = new Team();
	t1.setName("foo");
	t1.addMember("bar");
	Team t2 = new Team();
	t2.setName("bar");
	t2.addMember("foo");
	assert(t1.equals(t2) == false);
    }

    @Test
    public void equals_different_members_same_name() {
	Team t1 = new Team();
	t1.setName("foo");
	t1.addMember("bar");
	Team t2 = new Team();
	t2.setName("foo");
	t2.addMember("foo2");
	assert(t1.equals(t2) == false);
    }

    
    @Test
    public void hashCode_is_deterministic() {
	Team t1 = new Team();
	t1.setName("foo");
	t1.addMember("bar");
	Team t2 = new Team();
	t2.setName("foo");
	t2.addMember("bar");
	assertEquals(t1.hashCode(), t2.hashCode());
    }
    
    @Test
    public void hashCode_is_correct_using_or() {
	// instantiate t as a Team object
	Team t = new Team();
	int result = t.hashCode();
	int expectedResult = 1;
	assertEquals(expectedResult, result);
    }
    
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
