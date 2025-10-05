package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Sanjay C.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
	assertEquals("speeeday", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-00", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Phill() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Phill") || t.getMembers().contains("Phill C."),"Team should contain Phill Conrad");
    }

    @Test
    public void getTeam_returns_team_with_Kate() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Kate") || t.getMembers().contains("Kate L."),"Team should contain Kate Larrick");
    }

    @Test
    public void getTeam_returns_team_with_Derek() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Derek") || t.getMembers().contains("Derek K."),"Team should contain Derek Kirschbaum");
    }

    @Test
    public void getTeam_returns_team_with_Samuel() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Samuel") || t.getMembers().contains("Samuel Z."),"Team should contain Samuel Zhu");
    }

    @Test
    public void getTeam_returns_team_with_Sanjay() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Sanjay") || t.getMembers().contains("Sanjay C."),"Team should contain Sanjay Chandrasekaran");
    }

    @Test
    public void getTeam_returns_team_with_Divyani() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Divyani") || t.getMembers().contains("Divyani P."),"Team should contain Divyani Punj");
    }

    @Test
    public void getTeam_returns_team_with_Daniel() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Daniel") || t.getMembers().contains("Daniel J."),"Team should contain Daniel Jensen");
    }

}
