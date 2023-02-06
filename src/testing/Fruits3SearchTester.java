package testing;

import model.ProjectTester;
import model.ProjectTesterImp;
import model.SearchResult;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Fruits3SearchTester {
  public static void main(String[] args) throws Exception {
    ProjectTester tester =
        new ProjectTesterImp(); // Instantiate your own ProjectTester instance here
    tester.initialize();
    tester.crawl("https://people.scs.carleton.ca/~davidmckenney/fruits3/N-0.html");
    runTest(tester);
  }

  public static void runTest(ProjectTester tester) throws Exception {
    PrintWriter failOut = new PrintWriter(new FileWriter("Fruits3-Search-failed.txt"));
    PrintWriter passOut = new PrintWriter(new FileWriter("Fruits3-Search-passed.txt"));
    List<SearchResult> yourResult;
    // Test #409 checking search results for apple apricot fig blueberry with boost=true
    yourResult = tester.search("apple apricot fig blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apricot fig blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #409 checking search results for apple apricot fig blueberry with boost=true");
    // Test #410 checking search results for apple apricot fig blueberry with boost=false
    yourResult = tester.search("apple apricot fig blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apricot fig blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #410 checking search results for apple apricot fig blueberry with boost=false");
    // Test #411 checking search results for coconut papaya apple pear papaya with boost=true
    yourResult = tester.search("coconut papaya apple pear papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya apple pear papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #411 checking search results for coconut papaya apple pear papaya with boost=true");
    // Test #412 checking search results for coconut papaya apple pear papaya with boost=false
    yourResult = tester.search("coconut papaya apple pear papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya apple pear papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #412 checking search results for coconut papaya apple pear papaya with boost=false");
    // Test #413 checking search results for cherry orange orange papaya pear with boost=true
    yourResult = tester.search("cherry orange orange papaya pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange orange papaya pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #413 checking search results for cherry orange orange papaya pear with boost=true");
    // Test #414 checking search results for cherry orange orange papaya pear with boost=false
    yourResult = tester.search("cherry orange orange papaya pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange orange papaya pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #414 checking search results for cherry orange orange papaya pear with boost=false");
    // Test #415 checking search results for apple apple lime pear orange with boost=true
    yourResult = tester.search("apple apple lime pear orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple lime pear orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #415 checking search results for apple apple lime pear orange with boost=true");
    // Test #416 checking search results for apple apple lime pear orange with boost=false
    yourResult = tester.search("apple apple lime pear orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple lime pear orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #416 checking search results for apple apple lime pear orange with boost=false");
    // Test #417 checking search results for apple pear lime peach lime with boost=true
    yourResult = tester.search("apple pear lime peach lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear lime peach lime",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #417 checking search results for apple pear lime peach lime with boost=true");
    // Test #418 checking search results for apple pear lime peach lime with boost=false
    yourResult = tester.search("apple pear lime peach lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear lime peach lime",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #418 checking search results for apple pear lime peach lime with boost=false");
    // Test #419 checking search results for peach lime cherry peach orange with boost=true
    yourResult = tester.search("peach lime cherry peach orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach lime cherry peach orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #419 checking search results for peach lime cherry peach orange with boost=true");
    // Test #420 checking search results for peach lime cherry peach orange with boost=false
    yourResult = tester.search("peach lime cherry peach orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach lime cherry peach orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #420 checking search results for peach lime cherry peach orange with boost=false");
    // Test #421 checking search results for orange papaya lime kiwi kiwi with boost=true
    yourResult = tester.search("orange papaya lime kiwi kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya lime kiwi kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #421 checking search results for orange papaya lime kiwi kiwi with boost=true");
    // Test #422 checking search results for orange papaya lime kiwi kiwi with boost=false
    yourResult = tester.search("orange papaya lime kiwi kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya lime kiwi kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #422 checking search results for orange papaya lime kiwi kiwi with boost=false");
    // Test #423 checking search results for pear orange apple apple lime with boost=true
    yourResult = tester.search("pear orange apple apple lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange apple apple lime",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #423 checking search results for pear orange apple apple lime with boost=true");
    // Test #424 checking search results for pear orange apple apple lime with boost=false
    yourResult = tester.search("pear orange apple apple lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange apple apple lime",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #424 checking search results for pear orange apple apple lime with boost=false");
    // Test #425 checking search results for orange papaya papaya peach apple with boost=true
    yourResult = tester.search("orange papaya papaya peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya papaya peach apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #425 checking search results for orange papaya papaya peach apple with boost=true");
    // Test #426 checking search results for orange papaya papaya peach apple with boost=false
    yourResult = tester.search("orange papaya papaya peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya papaya peach apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #426 checking search results for orange papaya papaya peach apple with boost=false");
    // Test #427 checking search results for coconut papaya orange lime orange with boost=true
    yourResult = tester.search("coconut papaya orange lime orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya orange lime orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #427 checking search results for coconut papaya orange lime orange with boost=true");
    // Test #428 checking search results for coconut papaya orange lime orange with boost=false
    yourResult = tester.search("coconut papaya orange lime orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya orange lime orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #428 checking search results for coconut papaya orange lime orange with boost=false");
    // Test #429 checking search results for papaya cherry orange pear kiwi with boost=true
    yourResult = tester.search("papaya cherry orange pear kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya cherry orange pear kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #429 checking search results for papaya cherry orange pear kiwi with boost=true");
    // Test #430 checking search results for papaya cherry orange pear kiwi with boost=false
    yourResult = tester.search("papaya cherry orange pear kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya cherry orange pear kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #430 checking search results for papaya cherry orange pear kiwi with boost=false");
    // Test #431 checking search results for lime lime apple peach pear with boost=true
    yourResult = tester.search("lime lime apple peach pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime apple peach pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #431 checking search results for lime lime apple peach pear with boost=true");
    // Test #432 checking search results for lime lime apple peach pear with boost=false
    yourResult = tester.search("lime lime apple peach pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime apple peach pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #432 checking search results for lime lime apple peach pear with boost=false");
    // Test #433 checking search results for fig kiwi kiwi peach banana with boost=true
    yourResult = tester.search("fig kiwi kiwi peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig kiwi kiwi peach banana",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #433 checking search results for fig kiwi kiwi peach banana with boost=true");
    // Test #434 checking search results for fig kiwi kiwi peach banana with boost=false
    yourResult = tester.search("fig kiwi kiwi peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig kiwi kiwi peach banana",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #434 checking search results for fig kiwi kiwi peach banana with boost=false");
    // Test #435 checking search results for peach kiwi cherry orange orange with boost=true
    yourResult = tester.search("peach kiwi cherry orange orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach kiwi cherry orange orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #435 checking search results for peach kiwi cherry orange orange with boost=true");
    // Test #436 checking search results for peach kiwi cherry orange orange with boost=false
    yourResult = tester.search("peach kiwi cherry orange orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach kiwi cherry orange orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #436 checking search results for peach kiwi cherry orange orange with boost=false");
    // Test #437 checking search results for fig apple kiwi coconut apple with boost=true
    yourResult = tester.search("fig apple kiwi coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple kiwi coconut apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #437 checking search results for fig apple kiwi coconut apple with boost=true");
    // Test #438 checking search results for fig apple kiwi coconut apple with boost=false
    yourResult = tester.search("fig apple kiwi coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple kiwi coconut apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #438 checking search results for fig apple kiwi coconut apple with boost=false");
    // Test #439 checking search results for apricot blueberry fig pear orange with boost=true
    yourResult = tester.search("apricot blueberry fig pear orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot blueberry fig pear orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #439 checking search results for apricot blueberry fig pear orange with boost=true");
    // Test #440 checking search results for apricot blueberry fig pear orange with boost=false
    yourResult = tester.search("apricot blueberry fig pear orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot blueberry fig pear orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #440 checking search results for apricot blueberry fig pear orange with boost=false");
    // Test #441 checking search results for peach orange peach lime cherry with boost=true
    yourResult = tester.search("peach orange peach lime cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange peach lime cherry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #441 checking search results for peach orange peach lime cherry with boost=true");
    // Test #442 checking search results for peach orange peach lime cherry with boost=false
    yourResult = tester.search("peach orange peach lime cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange peach lime cherry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #442 checking search results for peach orange peach lime cherry with boost=false");
    // Test #443 checking search results for orange apricot fig lime banana with boost=true
    yourResult = tester.search("orange apricot fig lime banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot fig lime banana",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #443 checking search results for orange apricot fig lime banana with boost=true");
    // Test #444 checking search results for orange apricot fig lime banana with boost=false
    yourResult = tester.search("orange apricot fig lime banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot fig lime banana",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #444 checking search results for orange apricot fig lime banana with boost=false");
    // Test #445 checking search results for pear apple lime papaya with boost=true
    yourResult = tester.search("pear apple lime papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear apple lime papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #445 checking search results for pear apple lime papaya with boost=true");
    // Test #446 checking search results for pear apple lime papaya with boost=false
    yourResult = tester.search("pear apple lime papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear apple lime papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #446 checking search results for pear apple lime papaya with boost=false");
    // Test #447 checking search results for peach blueberry fig kiwi with boost=true
    yourResult = tester.search("peach blueberry fig kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach blueberry fig kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #447 checking search results for peach blueberry fig kiwi with boost=true");
    // Test #448 checking search results for peach blueberry fig kiwi with boost=false
    yourResult = tester.search("peach blueberry fig kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach blueberry fig kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #448 checking search results for peach blueberry fig kiwi with boost=false");
    // Test #449 checking search results for banana orange apple peach cherry with boost=true
    yourResult = tester.search("banana orange apple peach cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana orange apple peach cherry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #449 checking search results for banana orange apple peach cherry with boost=true");
    // Test #450 checking search results for banana orange apple peach cherry with boost=false
    yourResult = tester.search("banana orange apple peach cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana orange apple peach cherry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #450 checking search results for banana orange apple peach cherry with boost=false");
    // Test #451 checking search results for coconut orange lime orange papaya with boost=true
    yourResult = tester.search("coconut orange lime orange papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange lime orange papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #451 checking search results for coconut orange lime orange papaya with boost=true");
    // Test #452 checking search results for coconut orange lime orange papaya with boost=false
    yourResult = tester.search("coconut orange lime orange papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange lime orange papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #452 checking search results for coconut orange lime orange papaya with boost=false");
    // Test #453 checking search results for coconut apple pear apple apple with boost=true
    yourResult = tester.search("coconut apple pear apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple pear apple apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #453 checking search results for coconut apple pear apple apple with boost=true");
    // Test #454 checking search results for coconut apple pear apple apple with boost=false
    yourResult = tester.search("coconut apple pear apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple pear apple apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #454 checking search results for coconut apple pear apple apple with boost=false");
    // Test #455 checking search results for lime papaya orange orange blueberry with boost=true
    yourResult = tester.search("lime papaya orange orange blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya orange orange blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #455 checking search results for lime papaya orange orange blueberry with boost=true");
    // Test #456 checking search results for lime papaya orange orange blueberry with boost=false
    yourResult = tester.search("lime papaya orange orange blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya orange orange blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #456 checking search results for lime papaya orange orange blueberry with boost=false");
    // Test #457 checking search results for kiwi apple apple peach papaya with boost=true
    yourResult = tester.search("kiwi apple apple peach papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apple apple peach papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #457 checking search results for kiwi apple apple peach papaya with boost=true");
    // Test #458 checking search results for kiwi apple apple peach papaya with boost=false
    yourResult = tester.search("kiwi apple apple peach papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apple apple peach papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #458 checking search results for kiwi apple apple peach papaya with boost=false");
    // Test #459 checking search results for peach coconut peach lime papaya with boost=true
    yourResult = tester.search("peach coconut peach lime papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut peach lime papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #459 checking search results for peach coconut peach lime papaya with boost=true");
    // Test #460 checking search results for peach coconut peach lime papaya with boost=false
    yourResult = tester.search("peach coconut peach lime papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut peach lime papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #460 checking search results for peach coconut peach lime papaya with boost=false");
    // Test #461 checking search results for kiwi papaya peach cherry pear with boost=true
    yourResult = tester.search("kiwi papaya peach cherry pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya peach cherry pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #461 checking search results for kiwi papaya peach cherry pear with boost=true");
    // Test #462 checking search results for kiwi papaya peach cherry pear with boost=false
    yourResult = tester.search("kiwi papaya peach cherry pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya peach cherry pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #462 checking search results for kiwi papaya peach cherry pear with boost=false");
    // Test #463 checking search results for peach pear blueberry orange with boost=true
    yourResult = tester.search("peach pear blueberry orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear blueberry orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #463 checking search results for peach pear blueberry orange with boost=true");
    // Test #464 checking search results for peach pear blueberry orange with boost=false
    yourResult = tester.search("peach pear blueberry orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear blueberry orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #464 checking search results for peach pear blueberry orange with boost=false");
    // Test #465 checking search results for lime papaya coconut orange orange with boost=true
    yourResult = tester.search("lime papaya coconut orange orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya coconut orange orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #465 checking search results for lime papaya coconut orange orange with boost=true");
    // Test #466 checking search results for lime papaya coconut orange orange with boost=false
    yourResult = tester.search("lime papaya coconut orange orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya coconut orange orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #466 checking search results for lime papaya coconut orange orange with boost=false");
    // Test #467 checking search results for coconut orange blueberry orange lime with boost=true
    yourResult = tester.search("coconut orange blueberry orange lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange blueberry orange lime",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #467 checking search results for coconut orange blueberry orange lime with boost=true");
    // Test #468 checking search results for coconut orange blueberry orange lime with boost=false
    yourResult = tester.search("coconut orange blueberry orange lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange blueberry orange lime",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #468 checking search results for coconut orange blueberry orange lime with boost=false");
    // Test #469 checking search results for papaya lime pear tomato apple with boost=true
    yourResult = tester.search("papaya lime pear tomato apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime pear tomato apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #469 checking search results for papaya lime pear tomato apple with boost=true");
    // Test #470 checking search results for papaya lime pear tomato apple with boost=false
    yourResult = tester.search("papaya lime pear tomato apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime pear tomato apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #470 checking search results for papaya lime pear tomato apple with boost=false");
    // Test #471 checking search results for lime apricot banana fig kiwi with boost=true
    yourResult = tester.search("lime apricot banana fig kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apricot banana fig kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #471 checking search results for lime apricot banana fig kiwi with boost=true");
    // Test #472 checking search results for lime apricot banana fig kiwi with boost=false
    yourResult = tester.search("lime apricot banana fig kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apricot banana fig kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #472 checking search results for lime apricot banana fig kiwi with boost=false");
    // Test #473 checking search results for apricot orange banana banana coconut with boost=true
    yourResult = tester.search("apricot orange banana banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot orange banana banana coconut",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #473 checking search results for apricot orange banana banana coconut with boost=true");
    // Test #474 checking search results for apricot orange banana banana coconut with boost=false
    yourResult = tester.search("apricot orange banana banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot orange banana banana coconut",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #474 checking search results for apricot orange banana banana coconut with boost=false");
    // Test #475 checking search results for fig apple tomato apricot blueberry with boost=true
    yourResult = tester.search("fig apple tomato apricot blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple tomato apricot blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #475 checking search results for fig apple tomato apricot blueberry with boost=true");
    // Test #476 checking search results for fig apple tomato apricot blueberry with boost=false
    yourResult = tester.search("fig apple tomato apricot blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple tomato apricot blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #476 checking search results for fig apple tomato apricot blueberry with boost=false");
    // Test #477 checking search results for blueberry peach orange pear with boost=true
    yourResult = tester.search("blueberry peach orange pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry peach orange pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #477 checking search results for blueberry peach orange pear with boost=true");
    // Test #478 checking search results for blueberry peach orange pear with boost=false
    yourResult = tester.search("blueberry peach orange pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry peach orange pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #478 checking search results for blueberry peach orange pear with boost=false");
    // Test #479 checking search results for lime papaya kiwi apricot tomato with boost=true
    yourResult = tester.search("lime papaya kiwi apricot tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya kiwi apricot tomato",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #479 checking search results for lime papaya kiwi apricot tomato with boost=true");
    // Test #480 checking search results for lime papaya kiwi apricot tomato with boost=false
    yourResult = tester.search("lime papaya kiwi apricot tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya kiwi apricot tomato",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #480 checking search results for lime papaya kiwi apricot tomato with boost=false");
    // Test #481 checking search results for apple tomato apricot fig blueberry with boost=true
    yourResult = tester.search("apple tomato apricot fig blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato apricot fig blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #481 checking search results for apple tomato apricot fig blueberry with boost=true");
    // Test #482 checking search results for apple tomato apricot fig blueberry with boost=false
    yourResult = tester.search("apple tomato apricot fig blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato apricot fig blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #482 checking search results for apple tomato apricot fig blueberry with boost=false");
    // Test #483 checking search results for lime banana orange cherry cherry with boost=true
    yourResult = tester.search("lime banana orange cherry cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime banana orange cherry cherry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #483 checking search results for lime banana orange cherry cherry with boost=true");
    // Test #484 checking search results for lime banana orange cherry cherry with boost=false
    yourResult = tester.search("lime banana orange cherry cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime banana orange cherry cherry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #484 checking search results for lime banana orange cherry cherry with boost=false");
    // Test #485 checking search results for kiwi orange apple banana kiwi with boost=true
    yourResult = tester.search("kiwi orange apple banana kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi orange apple banana kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #485 checking search results for kiwi orange apple banana kiwi with boost=true");
    // Test #486 checking search results for kiwi orange apple banana kiwi with boost=false
    yourResult = tester.search("kiwi orange apple banana kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi orange apple banana kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #486 checking search results for kiwi orange apple banana kiwi with boost=false");
    // Test #487 checking search results for apple pear kiwi cherry apricot with boost=true
    yourResult = tester.search("apple pear kiwi cherry apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear kiwi cherry apricot",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #487 checking search results for apple pear kiwi cherry apricot with boost=true");
    // Test #488 checking search results for apple pear kiwi cherry apricot with boost=false
    yourResult = tester.search("apple pear kiwi cherry apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear kiwi cherry apricot",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #488 checking search results for apple pear kiwi cherry apricot with boost=false");
    // Test #489 checking search results for cherry orange fig kiwi kiwi with boost=true
    yourResult = tester.search("cherry orange fig kiwi kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange fig kiwi kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #489 checking search results for cherry orange fig kiwi kiwi with boost=true");
    // Test #490 checking search results for cherry orange fig kiwi kiwi with boost=false
    yourResult = tester.search("cherry orange fig kiwi kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange fig kiwi kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #490 checking search results for cherry orange fig kiwi kiwi with boost=false");
    // Test #491 checking search results for orange apple fig peach cherry with boost=true
    yourResult = tester.search("orange apple fig peach cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple fig peach cherry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #491 checking search results for orange apple fig peach cherry with boost=true");
    // Test #492 checking search results for orange apple fig peach cherry with boost=false
    yourResult = tester.search("orange apple fig peach cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple fig peach cherry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #492 checking search results for orange apple fig peach cherry with boost=false");
    // Test #493 checking search results for apple fig tomato blueberry kiwi with boost=true
    yourResult = tester.search("apple fig tomato blueberry kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig tomato blueberry kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #493 checking search results for apple fig tomato blueberry kiwi with boost=true");
    // Test #494 checking search results for apple fig tomato blueberry kiwi with boost=false
    yourResult = tester.search("apple fig tomato blueberry kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig tomato blueberry kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #494 checking search results for apple fig tomato blueberry kiwi with boost=false");
    // Test #495 checking search results for apple papaya lime pear with boost=true
    yourResult = tester.search("apple papaya lime pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya lime pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #495 checking search results for apple papaya lime pear with boost=true");
    // Test #496 checking search results for apple papaya lime pear with boost=false
    yourResult = tester.search("apple papaya lime pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya lime pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #496 checking search results for apple papaya lime pear with boost=false");
    // Test #497 checking search results for lime lime apple pear with boost=true
    yourResult = tester.search("lime lime apple pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime apple pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #497 checking search results for lime lime apple pear with boost=true");
    // Test #498 checking search results for lime lime apple pear with boost=false
    yourResult = tester.search("lime lime apple pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime apple pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #498 checking search results for lime lime apple pear with boost=false");
    // Test #499 checking search results for kiwi papaya lime apricot with boost=true
    yourResult = tester.search("kiwi papaya lime apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya lime apricot",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #499 checking search results for kiwi papaya lime apricot with boost=true");
    // Test #500 checking search results for kiwi papaya lime apricot with boost=false
    yourResult = tester.search("kiwi papaya lime apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya lime apricot",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #500 checking search results for kiwi papaya lime apricot with boost=false");
    // Test #501 checking search results for peach pear blueberry orange with boost=true
    yourResult = tester.search("peach pear blueberry orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear blueberry orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #501 checking search results for peach pear blueberry orange with boost=true");
    // Test #502 checking search results for peach pear blueberry orange with boost=false
    yourResult = tester.search("peach pear blueberry orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear blueberry orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #502 checking search results for peach pear blueberry orange with boost=false");
    // Test #503 checking search results for kiwi lime orange orange papaya with boost=true
    yourResult = tester.search("kiwi lime orange orange papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi lime orange orange papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #503 checking search results for kiwi lime orange orange papaya with boost=true");
    // Test #504 checking search results for kiwi lime orange orange papaya with boost=false
    yourResult = tester.search("kiwi lime orange orange papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi lime orange orange papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #504 checking search results for kiwi lime orange orange papaya with boost=false");
    // Test #505 checking search results for papaya apple peach kiwi apple with boost=true
    yourResult = tester.search("papaya apple peach kiwi apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya apple peach kiwi apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #505 checking search results for papaya apple peach kiwi apple with boost=true");
    // Test #506 checking search results for papaya apple peach kiwi apple with boost=false
    yourResult = tester.search("papaya apple peach kiwi apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya apple peach kiwi apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #506 checking search results for papaya apple peach kiwi apple with boost=false");
    // Test #507 checking search results for kiwi papaya lime kiwi orange with boost=true
    yourResult = tester.search("kiwi papaya lime kiwi orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya lime kiwi orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #507 checking search results for kiwi papaya lime kiwi orange with boost=true");
    // Test #508 checking search results for kiwi papaya lime kiwi orange with boost=false
    yourResult = tester.search("kiwi papaya lime kiwi orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya lime kiwi orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #508 checking search results for kiwi papaya lime kiwi orange with boost=false");
    // Test #509 checking search results for orange orange blueberry cherry kiwi with boost=true
    yourResult = tester.search("orange orange blueberry cherry kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange blueberry cherry kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #509 checking search results for orange orange blueberry cherry kiwi with boost=true");
    // Test #510 checking search results for orange orange blueberry cherry kiwi with boost=false
    yourResult = tester.search("orange orange blueberry cherry kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange blueberry cherry kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #510 checking search results for orange orange blueberry cherry kiwi with boost=false");
    // Test #511 checking search results for pear papaya lime tomato apple with boost=true
    yourResult = tester.search("pear papaya lime tomato apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear papaya lime tomato apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #511 checking search results for pear papaya lime tomato apple with boost=true");
    // Test #512 checking search results for pear papaya lime tomato apple with boost=false
    yourResult = tester.search("pear papaya lime tomato apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear papaya lime tomato apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #512 checking search results for pear papaya lime tomato apple with boost=false");
    // Test #513 checking search results for peach orange apple fig banana with boost=true
    yourResult = tester.search("peach orange apple fig banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange apple fig banana",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #513 checking search results for peach orange apple fig banana with boost=true");
    // Test #514 checking search results for peach orange apple fig banana with boost=false
    yourResult = tester.search("peach orange apple fig banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange apple fig banana",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #514 checking search results for peach orange apple fig banana with boost=false");
    // Test #515 checking search results for peach blueberry fig kiwi with boost=true
    yourResult = tester.search("peach blueberry fig kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach blueberry fig kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #515 checking search results for peach blueberry fig kiwi with boost=true");
    // Test #516 checking search results for peach blueberry fig kiwi with boost=false
    yourResult = tester.search("peach blueberry fig kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach blueberry fig kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #516 checking search results for peach blueberry fig kiwi with boost=false");
    // Test #517 checking search results for cherry apple kiwi pear apricot with boost=true
    yourResult = tester.search("cherry apple kiwi pear apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apple kiwi pear apricot",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #517 checking search results for cherry apple kiwi pear apricot with boost=true");
    // Test #518 checking search results for cherry apple kiwi pear apricot with boost=false
    yourResult = tester.search("cherry apple kiwi pear apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apple kiwi pear apricot",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #518 checking search results for cherry apple kiwi pear apricot with boost=false");
    // Test #519 checking search results for apricot blueberry apple fig with boost=true
    yourResult = tester.search("apricot blueberry apple fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot blueberry apple fig",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #519 checking search results for apricot blueberry apple fig with boost=true");
    // Test #520 checking search results for apricot blueberry apple fig with boost=false
    yourResult = tester.search("apricot blueberry apple fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot blueberry apple fig",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #520 checking search results for apricot blueberry apple fig with boost=false");
    // Test #521 checking search results for cherry pear papaya kiwi orange with boost=true
    yourResult = tester.search("cherry pear papaya kiwi orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry pear papaya kiwi orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #521 checking search results for cherry pear papaya kiwi orange with boost=true");
    // Test #522 checking search results for cherry pear papaya kiwi orange with boost=false
    yourResult = tester.search("cherry pear papaya kiwi orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry pear papaya kiwi orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #522 checking search results for cherry pear papaya kiwi orange with boost=false");
    // Test #523 checking search results for orange papaya cherry kiwi pear with boost=true
    yourResult = tester.search("orange papaya cherry kiwi pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya cherry kiwi pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #523 checking search results for orange papaya cherry kiwi pear with boost=true");
    // Test #524 checking search results for orange papaya cherry kiwi pear with boost=false
    yourResult = tester.search("orange papaya cherry kiwi pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya cherry kiwi pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #524 checking search results for orange papaya cherry kiwi pear with boost=false");
    // Test #525 checking search results for fig banana banana apricot kiwi with boost=true
    yourResult = tester.search("fig banana banana apricot kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig banana banana apricot kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #525 checking search results for fig banana banana apricot kiwi with boost=true");
    // Test #526 checking search results for fig banana banana apricot kiwi with boost=false
    yourResult = tester.search("fig banana banana apricot kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig banana banana apricot kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #526 checking search results for fig banana banana apricot kiwi with boost=false");
    // Test #527 checking search results for coconut peach cherry fig kiwi with boost=true
    yourResult = tester.search("coconut peach cherry fig kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach cherry fig kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #527 checking search results for coconut peach cherry fig kiwi with boost=true");
    // Test #528 checking search results for coconut peach cherry fig kiwi with boost=false
    yourResult = tester.search("coconut peach cherry fig kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach cherry fig kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #528 checking search results for coconut peach cherry fig kiwi with boost=false");
    // Test #529 checking search results for apricot lime papaya kiwi with boost=true
    yourResult = tester.search("apricot lime papaya kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot lime papaya kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #529 checking search results for apricot lime papaya kiwi with boost=true");
    // Test #530 checking search results for apricot lime papaya kiwi with boost=false
    yourResult = tester.search("apricot lime papaya kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot lime papaya kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #530 checking search results for apricot lime papaya kiwi with boost=false");
    // Test #531 checking search results for lime papaya apple tomato pear with boost=true
    yourResult = tester.search("lime papaya apple tomato pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya apple tomato pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #531 checking search results for lime papaya apple tomato pear with boost=true");
    // Test #532 checking search results for lime papaya apple tomato pear with boost=false
    yourResult = tester.search("lime papaya apple tomato pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya apple tomato pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #532 checking search results for lime papaya apple tomato pear with boost=false");
    // Test #533 checking search results for apricot cherry pear fig peach with boost=true
    yourResult = tester.search("apricot cherry pear fig peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot cherry pear fig peach",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #533 checking search results for apricot cherry pear fig peach with boost=true");
    // Test #534 checking search results for apricot cherry pear fig peach with boost=false
    yourResult = tester.search("apricot cherry pear fig peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot cherry pear fig peach",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #534 checking search results for apricot cherry pear fig peach with boost=false");
    // Test #535 checking search results for lime papaya lime peach coconut with boost=true
    yourResult = tester.search("lime papaya lime peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya lime peach coconut",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #535 checking search results for lime papaya lime peach coconut with boost=true");
    // Test #536 checking search results for lime papaya lime peach coconut with boost=false
    yourResult = tester.search("lime papaya lime peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya lime peach coconut",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #536 checking search results for lime papaya lime peach coconut with boost=false");
    // Test #537 checking search results for apple fig kiwi blueberry with boost=true
    yourResult = tester.search("apple fig kiwi blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig kiwi blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #537 checking search results for apple fig kiwi blueberry with boost=true");
    // Test #538 checking search results for apple fig kiwi blueberry with boost=false
    yourResult = tester.search("apple fig kiwi blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig kiwi blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #538 checking search results for apple fig kiwi blueberry with boost=false");
    // Test #539 checking search results for kiwi apricot fig banana lime with boost=true
    yourResult = tester.search("kiwi apricot fig banana lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apricot fig banana lime",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #539 checking search results for kiwi apricot fig banana lime with boost=true");
    // Test #540 checking search results for kiwi apricot fig banana lime with boost=false
    yourResult = tester.search("kiwi apricot fig banana lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apricot fig banana lime",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #540 checking search results for kiwi apricot fig banana lime with boost=false");
    // Test #541 checking search results for apple fig apricot blueberry with boost=true
    yourResult = tester.search("apple fig apricot blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig apricot blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #541 checking search results for apple fig apricot blueberry with boost=true");
    // Test #542 checking search results for apple fig apricot blueberry with boost=false
    yourResult = tester.search("apple fig apricot blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig apricot blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #542 checking search results for apple fig apricot blueberry with boost=false");
    // Test #543 checking search results for orange peach blueberry pear with boost=true
    yourResult = tester.search("orange peach blueberry pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach blueberry pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #543 checking search results for orange peach blueberry pear with boost=true");
    // Test #544 checking search results for orange peach blueberry pear with boost=false
    yourResult = tester.search("orange peach blueberry pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach blueberry pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #544 checking search results for orange peach blueberry pear with boost=false");
    // Test #545 checking search results for peach papaya pear peach papaya with boost=true
    yourResult = tester.search("peach papaya pear peach papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach papaya pear peach papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #545 checking search results for peach papaya pear peach papaya with boost=true");
    // Test #546 checking search results for peach papaya pear peach papaya with boost=false
    yourResult = tester.search("peach papaya pear peach papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach papaya pear peach papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #546 checking search results for peach papaya pear peach papaya with boost=false");
    // Test #547 checking search results for apple kiwi kiwi kiwi papaya with boost=true
    yourResult = tester.search("apple kiwi kiwi kiwi papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple kiwi kiwi kiwi papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #547 checking search results for apple kiwi kiwi kiwi papaya with boost=true");
    // Test #548 checking search results for apple kiwi kiwi kiwi papaya with boost=false
    yourResult = tester.search("apple kiwi kiwi kiwi papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple kiwi kiwi kiwi papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #548 checking search results for apple kiwi kiwi kiwi papaya with boost=false");
    // Test #549 checking search results for fig banana lime apricot orange with boost=true
    yourResult = tester.search("fig banana lime apricot orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig banana lime apricot orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #549 checking search results for fig banana lime apricot orange with boost=true");
    // Test #550 checking search results for fig banana lime apricot orange with boost=false
    yourResult = tester.search("fig banana lime apricot orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig banana lime apricot orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #550 checking search results for fig banana lime apricot orange with boost=false");
    // Test #551 checking search results for orange fig kiwi banana kiwi with boost=true
    yourResult = tester.search("orange fig kiwi banana kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange fig kiwi banana kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #551 checking search results for orange fig kiwi banana kiwi with boost=true");
    // Test #552 checking search results for orange fig kiwi banana kiwi with boost=false
    yourResult = tester.search("orange fig kiwi banana kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange fig kiwi banana kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #552 checking search results for orange fig kiwi banana kiwi with boost=false");
    // Test #553 checking search results for orange apple peach cherry fig with boost=true
    yourResult = tester.search("orange apple peach cherry fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple peach cherry fig",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #553 checking search results for orange apple peach cherry fig with boost=true");
    // Test #554 checking search results for orange apple peach cherry fig with boost=false
    yourResult = tester.search("orange apple peach cherry fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple peach cherry fig",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #554 checking search results for orange apple peach cherry fig with boost=false");
    // Test #555 checking search results for banana kiwi peach fig kiwi with boost=true
    yourResult = tester.search("banana kiwi peach fig kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana kiwi peach fig kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #555 checking search results for banana kiwi peach fig kiwi with boost=true");
    // Test #556 checking search results for banana kiwi peach fig kiwi with boost=false
    yourResult = tester.search("banana kiwi peach fig kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana kiwi peach fig kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #556 checking search results for banana kiwi peach fig kiwi with boost=false");
    // Test #557 checking search results for peach fig pear lime orange with boost=true
    yourResult = tester.search("peach fig pear lime orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach fig pear lime orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #557 checking search results for peach fig pear lime orange with boost=true");
    // Test #558 checking search results for peach fig pear lime orange with boost=false
    yourResult = tester.search("peach fig pear lime orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach fig pear lime orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #558 checking search results for peach fig pear lime orange with boost=false");
    // Test #559 checking search results for lime apple pear orange apple with boost=true
    yourResult = tester.search("lime apple pear orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apple pear orange apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #559 checking search results for lime apple pear orange apple with boost=true");
    // Test #560 checking search results for lime apple pear orange apple with boost=false
    yourResult = tester.search("lime apple pear orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apple pear orange apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #560 checking search results for lime apple pear orange apple with boost=false");
    // Test #561 checking search results for fig apple tomato kiwi blueberry with boost=true
    yourResult = tester.search("fig apple tomato kiwi blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple tomato kiwi blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #561 checking search results for fig apple tomato kiwi blueberry with boost=true");
    // Test #562 checking search results for fig apple tomato kiwi blueberry with boost=false
    yourResult = tester.search("fig apple tomato kiwi blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple tomato kiwi blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #562 checking search results for fig apple tomato kiwi blueberry with boost=false");
    // Test #563 checking search results for papaya orange apple lime apple with boost=true
    yourResult = tester.search("papaya orange apple lime apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya orange apple lime apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #563 checking search results for papaya orange apple lime apple with boost=true");
    // Test #564 checking search results for papaya orange apple lime apple with boost=false
    yourResult = tester.search("papaya orange apple lime apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya orange apple lime apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #564 checking search results for papaya orange apple lime apple with boost=false");
    // Test #565 checking search results for coconut fig cherry peach peach with boost=true
    yourResult = tester.search("coconut fig cherry peach peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig cherry peach peach",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #565 checking search results for coconut fig cherry peach peach with boost=true");
    // Test #566 checking search results for coconut fig cherry peach peach with boost=false
    yourResult = tester.search("coconut fig cherry peach peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig cherry peach peach",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #566 checking search results for coconut fig cherry peach peach with boost=false");
    // Test #567 checking search results for peach kiwi blueberry fig with boost=true
    yourResult = tester.search("peach kiwi blueberry fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach kiwi blueberry fig",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #567 checking search results for peach kiwi blueberry fig with boost=true");
    // Test #568 checking search results for peach kiwi blueberry fig with boost=false
    yourResult = tester.search("peach kiwi blueberry fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach kiwi blueberry fig",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #568 checking search results for peach kiwi blueberry fig with boost=false");
    // Test #569 checking search results for kiwi kiwi orange apple fig with boost=true
    yourResult = tester.search("kiwi kiwi orange apple fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi kiwi orange apple fig",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #569 checking search results for kiwi kiwi orange apple fig with boost=true");
    // Test #570 checking search results for kiwi kiwi orange apple fig with boost=false
    yourResult = tester.search("kiwi kiwi orange apple fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi kiwi orange apple fig",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #570 checking search results for kiwi kiwi orange apple fig with boost=false");
    // Test #571 checking search results for apple peach fig cherry orange with boost=true
    yourResult = tester.search("apple peach fig cherry orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig cherry orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #571 checking search results for apple peach fig cherry orange with boost=true");
    // Test #572 checking search results for apple peach fig cherry orange with boost=false
    yourResult = tester.search("apple peach fig cherry orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig cherry orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #572 checking search results for apple peach fig cherry orange with boost=false");
    // Test #573 checking search results for pear cherry papaya orange kiwi with boost=true
    yourResult = tester.search("pear cherry papaya orange kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear cherry papaya orange kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #573 checking search results for pear cherry papaya orange kiwi with boost=true");
    // Test #574 checking search results for pear cherry papaya orange kiwi with boost=false
    yourResult = tester.search("pear cherry papaya orange kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear cherry papaya orange kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #574 checking search results for pear cherry papaya orange kiwi with boost=false");
    // Test #575 checking search results for kiwi pear peach cherry papaya with boost=true
    yourResult = tester.search("kiwi pear peach cherry papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear peach cherry papaya",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #575 checking search results for kiwi pear peach cherry papaya with boost=true");
    // Test #576 checking search results for kiwi pear peach cherry papaya with boost=false
    yourResult = tester.search("kiwi pear peach cherry papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear peach cherry papaya",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #576 checking search results for kiwi pear peach cherry papaya with boost=false");
    // Test #577 checking search results for orange kiwi kiwi banana fig with boost=true
    yourResult = tester.search("orange kiwi kiwi banana fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange kiwi kiwi banana fig",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #577 checking search results for orange kiwi kiwi banana fig with boost=true");
    // Test #578 checking search results for orange kiwi kiwi banana fig with boost=false
    yourResult = tester.search("orange kiwi kiwi banana fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange kiwi kiwi banana fig",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #578 checking search results for orange kiwi kiwi banana fig with boost=false");
    // Test #579 checking search results for papaya peach papaya orange apple with boost=true
    yourResult = tester.search("papaya peach papaya orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya peach papaya orange apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #579 checking search results for papaya peach papaya orange apple with boost=true");
    // Test #580 checking search results for papaya peach papaya orange apple with boost=false
    yourResult = tester.search("papaya peach papaya orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya peach papaya orange apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #580 checking search results for papaya peach papaya orange apple with boost=false");
    // Test #581 checking search results for coconut peach peach cherry tomato with boost=true
    yourResult = tester.search("coconut peach peach cherry tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach cherry tomato",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #581 checking search results for coconut peach peach cherry tomato with boost=true");
    // Test #582 checking search results for coconut peach peach cherry tomato with boost=false
    yourResult = tester.search("coconut peach peach cherry tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach peach cherry tomato",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #582 checking search results for coconut peach peach cherry tomato with boost=false");
    // Test #583 checking search results for papaya lime orange orange coconut with boost=true
    yourResult = tester.search("papaya lime orange orange coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime orange orange coconut",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #583 checking search results for papaya lime orange orange coconut with boost=true");
    // Test #584 checking search results for papaya lime orange orange coconut with boost=false
    yourResult = tester.search("papaya lime orange orange coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime orange orange coconut",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #584 checking search results for papaya lime orange orange coconut with boost=false");
    // Test #585 checking search results for cherry orange papaya kiwi pear with boost=true
    yourResult = tester.search("cherry orange papaya kiwi pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange papaya kiwi pear",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #585 checking search results for cherry orange papaya kiwi pear with boost=true");
    // Test #586 checking search results for cherry orange papaya kiwi pear with boost=false
    yourResult = tester.search("cherry orange papaya kiwi pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange papaya kiwi pear",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #586 checking search results for cherry orange papaya kiwi pear with boost=false");
    // Test #587 checking search results for fig papaya banana apple banana with boost=true
    yourResult = tester.search("fig papaya banana apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig papaya banana apple banana",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #587 checking search results for fig papaya banana apple banana with boost=true");
    // Test #588 checking search results for fig papaya banana apple banana with boost=false
    yourResult = tester.search("fig papaya banana apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig papaya banana apple banana",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #588 checking search results for fig papaya banana apple banana with boost=false");
    // Test #589 checking search results for peach pear orange blueberry with boost=true
    yourResult = tester.search("peach pear orange blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear orange blueberry",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #589 checking search results for peach pear orange blueberry with boost=true");
    // Test #590 checking search results for peach pear orange blueberry with boost=false
    yourResult = tester.search("peach pear orange blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear orange blueberry",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #590 checking search results for peach pear orange blueberry with boost=false");
    // Test #591 checking search results for peach apple peach banana apple with boost=true
    yourResult = tester.search("peach apple peach banana apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple peach banana apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #591 checking search results for peach apple peach banana apple with boost=true");
    // Test #592 checking search results for peach apple peach banana apple with boost=false
    yourResult = tester.search("peach apple peach banana apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple peach banana apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #592 checking search results for peach apple peach banana apple with boost=false");
    // Test #593 checking search results for coconut cherry peach kiwi fig with boost=true
    yourResult = tester.search("coconut cherry peach kiwi fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut cherry peach kiwi fig",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #593 checking search results for coconut cherry peach kiwi fig with boost=true");
    // Test #594 checking search results for coconut cherry peach kiwi fig with boost=false
    yourResult = tester.search("coconut cherry peach kiwi fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut cherry peach kiwi fig",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #594 checking search results for coconut cherry peach kiwi fig with boost=false");
    // Test #595 checking search results for lime peach lime pear tomato with boost=true
    yourResult = tester.search("lime peach lime pear tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime peach lime pear tomato",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #595 checking search results for lime peach lime pear tomato with boost=true");
    // Test #596 checking search results for lime peach lime pear tomato with boost=false
    yourResult = tester.search("lime peach lime pear tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime peach lime pear tomato",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #596 checking search results for lime peach lime pear tomato with boost=false");
    // Test #597 checking search results for blueberry fig kiwi apple with boost=true
    yourResult = tester.search("blueberry fig kiwi apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry fig kiwi apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #597 checking search results for blueberry fig kiwi apple with boost=true");
    // Test #598 checking search results for blueberry fig kiwi apple with boost=false
    yourResult = tester.search("blueberry fig kiwi apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry fig kiwi apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #598 checking search results for blueberry fig kiwi apple with boost=false");
    // Test #599 checking search results for apple fig blueberry apricot with boost=true
    yourResult = tester.search("apple fig blueberry apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig blueberry apricot",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #599 checking search results for apple fig blueberry apricot with boost=true");
    // Test #600 checking search results for apple fig blueberry apricot with boost=false
    yourResult = tester.search("apple fig blueberry apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig blueberry apricot",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #600 checking search results for apple fig blueberry apricot with boost=false");
    // Test #601 checking search results for apple apple lime orange apple with boost=true
    yourResult = tester.search("apple apple lime orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple lime orange apple",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #601 checking search results for apple apple lime orange apple with boost=true");
    // Test #602 checking search results for apple apple lime orange apple with boost=false
    yourResult = tester.search("apple apple lime orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple lime orange apple",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #602 checking search results for apple apple lime orange apple with boost=false");
    // Test #603 checking search results for apple tomato blueberry fig apricot with boost=true
    yourResult = tester.search("apple tomato blueberry fig apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato blueberry fig apricot",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #603 checking search results for apple tomato blueberry fig apricot with boost=true");
    // Test #604 checking search results for apple tomato blueberry fig apricot with boost=false
    yourResult = tester.search("apple tomato blueberry fig apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato blueberry fig apricot",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #604 checking search results for apple tomato blueberry fig apricot with boost=false");
    // Test #605 checking search results for kiwi lime fig pear orange with boost=true
    yourResult = tester.search("kiwi lime fig pear orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi lime fig pear orange",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #605 checking search results for kiwi lime fig pear orange with boost=true");
    // Test #606 checking search results for kiwi lime fig pear orange with boost=false
    yourResult = tester.search("kiwi lime fig pear orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi lime fig pear orange",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #606 checking search results for kiwi lime fig pear orange with boost=false");
    // Test #607 checking search results for orange peach blueberry lime kiwi with boost=true
    yourResult = tester.search("orange peach blueberry lime kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach blueberry lime kiwi",
        true,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #607 checking search results for orange peach blueberry lime kiwi with boost=true");
    // Test #608 checking search results for orange peach blueberry lime kiwi with boost=false
    yourResult = tester.search("orange peach blueberry lime kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach blueberry lime kiwi",
        false,
        passOut,
        failOut,
        "Fruits3SearchTester",
        "Test #608 checking search results for orange peach blueberry lime kiwi with boost=false");
    failOut.close();
    passOut.close();
  }
}
