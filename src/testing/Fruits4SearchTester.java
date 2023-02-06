package testing;

import model.ProjectTester;
import model.ProjectTesterImp;
import model.SearchResult;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Fruits4SearchTester {
  public static void main(String[] args) throws Exception {
    ProjectTester tester =
        new ProjectTesterImp(); // Instantiate your own ProjectTester instance here
    tester.initialize();
    tester.crawl("https://people.scs.carleton.ca/~davidmckenney/fruits4/N-0.html");
    runTest(tester);
  }

  public static void runTest(ProjectTester tester) throws Exception {
    PrintWriter failOut = new PrintWriter(new FileWriter("Fruits4-Search-failed.txt"));
    PrintWriter passOut = new PrintWriter(new FileWriter("Fruits4-Search-passed.txt"));
    List<SearchResult> yourResult;
    // Test #409 checking search results for kiwi pear apple apricot with boost=true
    yourResult = tester.search("kiwi pear apple apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear apple apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #409 checking search results for kiwi pear apple apricot with boost=true");
    // Test #410 checking search results for kiwi pear apple apricot with boost=false
    yourResult = tester.search("kiwi pear apple apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear apple apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #410 checking search results for kiwi pear apple apricot with boost=false");
    // Test #411 checking search results for apple orange apricot papaya with boost=true
    yourResult = tester.search("apple orange apricot papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple orange apricot papaya",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #411 checking search results for apple orange apricot papaya with boost=true");
    // Test #412 checking search results for apple orange apricot papaya with boost=false
    yourResult = tester.search("apple orange apricot papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple orange apricot papaya",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #412 checking search results for apple orange apricot papaya with boost=false");
    // Test #413 checking search results for peach fig apple with boost=true
    yourResult = tester.search("peach fig apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach fig apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #413 checking search results for peach fig apple with boost=true");
    // Test #414 checking search results for peach fig apple with boost=false
    yourResult = tester.search("peach fig apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach fig apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #414 checking search results for peach fig apple with boost=false");
    // Test #415 checking search results for apple peach fig with boost=true
    yourResult = tester.search("apple peach fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #415 checking search results for apple peach fig with boost=true");
    // Test #416 checking search results for apple peach fig with boost=false
    yourResult = tester.search("apple peach fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #416 checking search results for apple peach fig with boost=false");
    // Test #417 checking search results for orange kiwi cherry peach orange with boost=true
    yourResult = tester.search("orange kiwi cherry peach orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange kiwi cherry peach orange",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #417 checking search results for orange kiwi cherry peach orange with boost=true");
    // Test #418 checking search results for orange kiwi cherry peach orange with boost=false
    yourResult = tester.search("orange kiwi cherry peach orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange kiwi cherry peach orange",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #418 checking search results for orange kiwi cherry peach orange with boost=false");
    // Test #419 checking search results for fig pear pear apple cherry with boost=true
    yourResult = tester.search("fig pear pear apple cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig pear pear apple cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #419 checking search results for fig pear pear apple cherry with boost=true");
    // Test #420 checking search results for fig pear pear apple cherry with boost=false
    yourResult = tester.search("fig pear pear apple cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig pear pear apple cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #420 checking search results for fig pear pear apple cherry with boost=false");
    // Test #421 checking search results for peach apple fig tomato with boost=true
    yourResult = tester.search("peach apple fig tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig tomato",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #421 checking search results for peach apple fig tomato with boost=true");
    // Test #422 checking search results for peach apple fig tomato with boost=false
    yourResult = tester.search("peach apple fig tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig tomato",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #422 checking search results for peach apple fig tomato with boost=false");
    // Test #423 checking search results for apple apricot lime kiwi orange with boost=true
    yourResult = tester.search("apple apricot lime kiwi orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apricot lime kiwi orange",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #423 checking search results for apple apricot lime kiwi orange with boost=true");
    // Test #424 checking search results for apple apricot lime kiwi orange with boost=false
    yourResult = tester.search("apple apricot lime kiwi orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apricot lime kiwi orange",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #424 checking search results for apple apricot lime kiwi orange with boost=false");
    // Test #425 checking search results for coconut lime pear cherry lime with boost=true
    yourResult = tester.search("coconut lime pear cherry lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime pear cherry lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #425 checking search results for coconut lime pear cherry lime with boost=true");
    // Test #426 checking search results for coconut lime pear cherry lime with boost=false
    yourResult = tester.search("coconut lime pear cherry lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime pear cherry lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #426 checking search results for coconut lime pear cherry lime with boost=false");
    // Test #427 checking search results for papaya pear coconut banana papaya with boost=true
    yourResult = tester.search("papaya pear coconut banana papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya pear coconut banana papaya",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #427 checking search results for papaya pear coconut banana papaya with boost=true");
    // Test #428 checking search results for papaya pear coconut banana papaya with boost=false
    yourResult = tester.search("papaya pear coconut banana papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya pear coconut banana papaya",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #428 checking search results for papaya pear coconut banana papaya with boost=false");
    // Test #429 checking search results for apple pear blueberry pear apricot with boost=true
    yourResult = tester.search("apple pear blueberry pear apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear blueberry pear apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #429 checking search results for apple pear blueberry pear apricot with boost=true");
    // Test #430 checking search results for apple pear blueberry pear apricot with boost=false
    yourResult = tester.search("apple pear blueberry pear apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear blueberry pear apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #430 checking search results for apple pear blueberry pear apricot with boost=false");
    // Test #431 checking search results for cherry lime blueberry fig pear with boost=true
    yourResult = tester.search("cherry lime blueberry fig pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry lime blueberry fig pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #431 checking search results for cherry lime blueberry fig pear with boost=true");
    // Test #432 checking search results for cherry lime blueberry fig pear with boost=false
    yourResult = tester.search("cherry lime blueberry fig pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry lime blueberry fig pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #432 checking search results for cherry lime blueberry fig pear with boost=false");
    // Test #433 checking search results for coconut peach lime kiwi cherry with boost=true
    yourResult = tester.search("coconut peach lime kiwi cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach lime kiwi cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #433 checking search results for coconut peach lime kiwi cherry with boost=true");
    // Test #434 checking search results for coconut peach lime kiwi cherry with boost=false
    yourResult = tester.search("coconut peach lime kiwi cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach lime kiwi cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #434 checking search results for coconut peach lime kiwi cherry with boost=false");
    // Test #435 checking search results for lime apple cherry orange blueberry with boost=true
    yourResult = tester.search("lime apple cherry orange blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apple cherry orange blueberry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #435 checking search results for lime apple cherry orange blueberry with boost=true");
    // Test #436 checking search results for lime apple cherry orange blueberry with boost=false
    yourResult = tester.search("lime apple cherry orange blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apple cherry orange blueberry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #436 checking search results for lime apple cherry orange blueberry with boost=false");
    // Test #437 checking search results for peach apple fig with boost=true
    yourResult = tester.search("peach apple fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #437 checking search results for peach apple fig with boost=true");
    // Test #438 checking search results for peach apple fig with boost=false
    yourResult = tester.search("peach apple fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #438 checking search results for peach apple fig with boost=false");
    // Test #439 checking search results for apple pear apricot kiwi with boost=true
    yourResult = tester.search("apple pear apricot kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear apricot kiwi",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #439 checking search results for apple pear apricot kiwi with boost=true");
    // Test #440 checking search results for apple pear apricot kiwi with boost=false
    yourResult = tester.search("apple pear apricot kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple pear apricot kiwi",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #440 checking search results for apple pear apricot kiwi with boost=false");
    // Test #441 checking search results for orange blueberry papaya apricot with boost=true
    yourResult = tester.search("orange blueberry papaya apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange blueberry papaya apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #441 checking search results for orange blueberry papaya apricot with boost=true");
    // Test #442 checking search results for orange blueberry papaya apricot with boost=false
    yourResult = tester.search("orange blueberry papaya apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange blueberry papaya apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #442 checking search results for orange blueberry papaya apricot with boost=false");
    // Test #443 checking search results for blueberry kiwi banana banana orange with boost=true
    yourResult = tester.search("blueberry kiwi banana banana orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry kiwi banana banana orange",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #443 checking search results for blueberry kiwi banana banana orange with boost=true");
    // Test #444 checking search results for blueberry kiwi banana banana orange with boost=false
    yourResult = tester.search("blueberry kiwi banana banana orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry kiwi banana banana orange",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #444 checking search results for blueberry kiwi banana banana orange with boost=false");
    // Test #445 checking search results for apple peach fig with boost=true
    yourResult = tester.search("apple peach fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #445 checking search results for apple peach fig with boost=true");
    // Test #446 checking search results for apple peach fig with boost=false
    yourResult = tester.search("apple peach fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #446 checking search results for apple peach fig with boost=false");
    // Test #447 checking search results for fig orange apple pear kiwi with boost=true
    yourResult = tester.search("fig orange apple pear kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig orange apple pear kiwi",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #447 checking search results for fig orange apple pear kiwi with boost=true");
    // Test #448 checking search results for fig orange apple pear kiwi with boost=false
    yourResult = tester.search("fig orange apple pear kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig orange apple pear kiwi",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #448 checking search results for fig orange apple pear kiwi with boost=false");
    // Test #449 checking search results for fig lime kiwi pear apple with boost=true
    yourResult = tester.search("fig lime kiwi pear apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig lime kiwi pear apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #449 checking search results for fig lime kiwi pear apple with boost=true");
    // Test #450 checking search results for fig lime kiwi pear apple with boost=false
    yourResult = tester.search("fig lime kiwi pear apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig lime kiwi pear apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #450 checking search results for fig lime kiwi pear apple with boost=false");
    // Test #451 checking search results for coconut cherry orange pear blueberry with boost=true
    yourResult = tester.search("coconut cherry orange pear blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut cherry orange pear blueberry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #451 checking search results for coconut cherry orange pear blueberry with boost=true");
    // Test #452 checking search results for coconut cherry orange pear blueberry with boost=false
    yourResult = tester.search("coconut cherry orange pear blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut cherry orange pear blueberry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #452 checking search results for coconut cherry orange pear blueberry with boost=false");
    // Test #453 checking search results for orange pear orange apricot banana with boost=true
    yourResult = tester.search("orange pear orange apricot banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange pear orange apricot banana",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #453 checking search results for orange pear orange apricot banana with boost=true");
    // Test #454 checking search results for orange pear orange apricot banana with boost=false
    yourResult = tester.search("orange pear orange apricot banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange pear orange apricot banana",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #454 checking search results for orange pear orange apricot banana with boost=false");
    // Test #455 checking search results for papaya coconut papaya banana pear with boost=true
    yourResult = tester.search("papaya coconut papaya banana pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya coconut papaya banana pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #455 checking search results for papaya coconut papaya banana pear with boost=true");
    // Test #456 checking search results for papaya coconut papaya banana pear with boost=false
    yourResult = tester.search("papaya coconut papaya banana pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya coconut papaya banana pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #456 checking search results for papaya coconut papaya banana pear with boost=false");
    // Test #457 checking search results for apricot kiwi orange apple with boost=true
    yourResult = tester.search("apricot kiwi orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot kiwi orange apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #457 checking search results for apricot kiwi orange apple with boost=true");
    // Test #458 checking search results for apricot kiwi orange apple with boost=false
    yourResult = tester.search("apricot kiwi orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot kiwi orange apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #458 checking search results for apricot kiwi orange apple with boost=false");
    // Test #459 checking search results for blueberry apple lime lime cherry with boost=true
    yourResult = tester.search("blueberry apple lime lime cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple lime lime cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #459 checking search results for blueberry apple lime lime cherry with boost=true");
    // Test #460 checking search results for blueberry apple lime lime cherry with boost=false
    yourResult = tester.search("blueberry apple lime lime cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple lime lime cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #460 checking search results for blueberry apple lime lime cherry with boost=false");
    // Test #461 checking search results for apple peach fig with boost=true
    yourResult = tester.search("apple peach fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #461 checking search results for apple peach fig with boost=true");
    // Test #462 checking search results for apple peach fig with boost=false
    yourResult = tester.search("apple peach fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #462 checking search results for apple peach fig with boost=false");
    // Test #463 checking search results for coconut apple lime lime pear with boost=true
    yourResult = tester.search("coconut apple lime lime pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple lime lime pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #463 checking search results for coconut apple lime lime pear with boost=true");
    // Test #464 checking search results for coconut apple lime lime pear with boost=false
    yourResult = tester.search("coconut apple lime lime pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple lime lime pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #464 checking search results for coconut apple lime lime pear with boost=false");
    // Test #465 checking search results for fig peach apple with boost=true
    yourResult = tester.search("fig peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig peach apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #465 checking search results for fig peach apple with boost=true");
    // Test #466 checking search results for fig peach apple with boost=false
    yourResult = tester.search("fig peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig peach apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #466 checking search results for fig peach apple with boost=false");
    // Test #467 checking search results for papaya tomato blueberry apricot orange with boost=true
    yourResult = tester.search("papaya tomato blueberry apricot orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya tomato blueberry apricot orange",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #467 checking search results for papaya tomato blueberry apricot orange with boost=true");
    // Test #468 checking search results for papaya tomato blueberry apricot orange with boost=false
    yourResult = tester.search("papaya tomato blueberry apricot orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya tomato blueberry apricot orange",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #468 checking search results for papaya tomato blueberry apricot orange with boost=false");
    // Test #469 checking search results for banana orange apple blueberry banana with boost=true
    yourResult = tester.search("banana orange apple blueberry banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana orange apple blueberry banana",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #469 checking search results for banana orange apple blueberry banana with boost=true");
    // Test #470 checking search results for banana orange apple blueberry banana with boost=false
    yourResult = tester.search("banana orange apple blueberry banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana orange apple blueberry banana",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #470 checking search results for banana orange apple blueberry banana with boost=false");
    // Test #471 checking search results for fig peach apple tomato with boost=true
    yourResult = tester.search("fig peach apple tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig peach apple tomato",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #471 checking search results for fig peach apple tomato with boost=true");
    // Test #472 checking search results for fig peach apple tomato with boost=false
    yourResult = tester.search("fig peach apple tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig peach apple tomato",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #472 checking search results for fig peach apple tomato with boost=false");
    // Test #473 checking search results for coconut lime lime apricot papaya with boost=true
    yourResult = tester.search("coconut lime lime apricot papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime lime apricot papaya",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #473 checking search results for coconut lime lime apricot papaya with boost=true");
    // Test #474 checking search results for coconut lime lime apricot papaya with boost=false
    yourResult = tester.search("coconut lime lime apricot papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime lime apricot papaya",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #474 checking search results for coconut lime lime apricot papaya with boost=false");
    // Test #475 checking search results for tomato tomato fig peach apple with boost=true
    yourResult = tester.search("tomato tomato fig peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato tomato fig peach apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #475 checking search results for tomato tomato fig peach apple with boost=true");
    // Test #476 checking search results for tomato tomato fig peach apple with boost=false
    yourResult = tester.search("tomato tomato fig peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato tomato fig peach apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #476 checking search results for tomato tomato fig peach apple with boost=false");
    // Test #477 checking search results for papaya lime lime kiwi coconut with boost=true
    yourResult = tester.search("papaya lime lime kiwi coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime lime kiwi coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #477 checking search results for papaya lime lime kiwi coconut with boost=true");
    // Test #478 checking search results for papaya lime lime kiwi coconut with boost=false
    yourResult = tester.search("papaya lime lime kiwi coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime lime kiwi coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #478 checking search results for papaya lime lime kiwi coconut with boost=false");
    // Test #479 checking search results for apple kiwi fig pear orange with boost=true
    yourResult = tester.search("apple kiwi fig pear orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple kiwi fig pear orange",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #479 checking search results for apple kiwi fig pear orange with boost=true");
    // Test #480 checking search results for apple kiwi fig pear orange with boost=false
    yourResult = tester.search("apple kiwi fig pear orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple kiwi fig pear orange",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #480 checking search results for apple kiwi fig pear orange with boost=false");
    // Test #481 checking search results for peach apple fig with boost=true
    yourResult = tester.search("peach apple fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #481 checking search results for peach apple fig with boost=true");
    // Test #482 checking search results for peach apple fig with boost=false
    yourResult = tester.search("peach apple fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #482 checking search results for peach apple fig with boost=false");
    // Test #483 checking search results for coconut pear cherry blueberry apple with boost=true
    yourResult = tester.search("coconut pear cherry blueberry apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut pear cherry blueberry apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #483 checking search results for coconut pear cherry blueberry apple with boost=true");
    // Test #484 checking search results for coconut pear cherry blueberry apple with boost=false
    yourResult = tester.search("coconut pear cherry blueberry apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut pear cherry blueberry apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #484 checking search results for coconut pear cherry blueberry apple with boost=false");
    // Test #485 checking search results for pear orange pear coconut fig with boost=true
    yourResult = tester.search("pear orange pear coconut fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange pear coconut fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #485 checking search results for pear orange pear coconut fig with boost=true");
    // Test #486 checking search results for pear orange pear coconut fig with boost=false
    yourResult = tester.search("pear orange pear coconut fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange pear coconut fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #486 checking search results for pear orange pear coconut fig with boost=false");
    // Test #487 checking search results for apricot coconut orange blueberry with boost=true
    yourResult = tester.search("apricot coconut orange blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot coconut orange blueberry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #487 checking search results for apricot coconut orange blueberry with boost=true");
    // Test #488 checking search results for apricot coconut orange blueberry with boost=false
    yourResult = tester.search("apricot coconut orange blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot coconut orange blueberry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #488 checking search results for apricot coconut orange blueberry with boost=false");
    // Test #489 checking search results for kiwi blueberry apple pear pear with boost=true
    yourResult = tester.search("kiwi blueberry apple pear pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi blueberry apple pear pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #489 checking search results for kiwi blueberry apple pear pear with boost=true");
    // Test #490 checking search results for kiwi blueberry apple pear pear with boost=false
    yourResult = tester.search("kiwi blueberry apple pear pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi blueberry apple pear pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #490 checking search results for kiwi blueberry apple pear pear with boost=false");
    // Test #491 checking search results for fig apple peach with boost=true
    yourResult = tester.search("fig apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple peach",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #491 checking search results for fig apple peach with boost=true");
    // Test #492 checking search results for fig apple peach with boost=false
    yourResult = tester.search("fig apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple peach",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #492 checking search results for fig apple peach with boost=false");
    // Test #493 checking search results for orange orange apricot apple cherry with boost=true
    yourResult = tester.search("orange orange apricot apple cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange apricot apple cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #493 checking search results for orange orange apricot apple cherry with boost=true");
    // Test #494 checking search results for orange orange apricot apple cherry with boost=false
    yourResult = tester.search("orange orange apricot apple cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange apricot apple cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #494 checking search results for orange orange apricot apple cherry with boost=false");
    // Test #495 checking search results for orange orange cherry kiwi peach with boost=true
    yourResult = tester.search("orange orange cherry kiwi peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange cherry kiwi peach",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #495 checking search results for orange orange cherry kiwi peach with boost=true");
    // Test #496 checking search results for orange orange cherry kiwi peach with boost=false
    yourResult = tester.search("orange orange cherry kiwi peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange cherry kiwi peach",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #496 checking search results for orange orange cherry kiwi peach with boost=false");
    // Test #497 checking search results for orange lime kiwi apricot apple with boost=true
    yourResult = tester.search("orange lime kiwi apricot apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime kiwi apricot apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #497 checking search results for orange lime kiwi apricot apple with boost=true");
    // Test #498 checking search results for orange lime kiwi apricot apple with boost=false
    yourResult = tester.search("orange lime kiwi apricot apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime kiwi apricot apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #498 checking search results for orange lime kiwi apricot apple with boost=false");
    // Test #499 checking search results for cherry pear pear fig apple with boost=true
    yourResult = tester.search("cherry pear pear fig apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry pear pear fig apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #499 checking search results for cherry pear pear fig apple with boost=true");
    // Test #500 checking search results for cherry pear pear fig apple with boost=false
    yourResult = tester.search("cherry pear pear fig apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry pear pear fig apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #500 checking search results for cherry pear pear fig apple with boost=false");
    // Test #501 checking search results for papaya orange banana pear papaya with boost=true
    yourResult = tester.search("papaya orange banana pear papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya orange banana pear papaya",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #501 checking search results for papaya orange banana pear papaya with boost=true");
    // Test #502 checking search results for papaya orange banana pear papaya with boost=false
    yourResult = tester.search("papaya orange banana pear papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya orange banana pear papaya",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #502 checking search results for papaya orange banana pear papaya with boost=false");
    // Test #503 checking search results for orange apple blueberry banana banana with boost=true
    yourResult = tester.search("orange apple blueberry banana banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple blueberry banana banana",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #503 checking search results for orange apple blueberry banana banana with boost=true");
    // Test #504 checking search results for orange apple blueberry banana banana with boost=false
    yourResult = tester.search("orange apple blueberry banana banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple blueberry banana banana",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #504 checking search results for orange apple blueberry banana banana with boost=false");
    // Test #505 checking search results for lime lime kiwi apricot cherry with boost=true
    yourResult = tester.search("lime lime kiwi apricot cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime kiwi apricot cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #505 checking search results for lime lime kiwi apricot cherry with boost=true");
    // Test #506 checking search results for lime lime kiwi apricot cherry with boost=false
    yourResult = tester.search("lime lime kiwi apricot cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime kiwi apricot cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #506 checking search results for lime lime kiwi apricot cherry with boost=false");
    // Test #507 checking search results for papaya pear blueberry orange coconut with boost=true
    yourResult = tester.search("papaya pear blueberry orange coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya pear blueberry orange coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #507 checking search results for papaya pear blueberry orange coconut with boost=true");
    // Test #508 checking search results for papaya pear blueberry orange coconut with boost=false
    yourResult = tester.search("papaya pear blueberry orange coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya pear blueberry orange coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #508 checking search results for papaya pear blueberry orange coconut with boost=false");
    // Test #509 checking search results for fig apricot orange lime apple with boost=true
    yourResult = tester.search("fig apricot orange lime apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apricot orange lime apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #509 checking search results for fig apricot orange lime apple with boost=true");
    // Test #510 checking search results for fig apricot orange lime apple with boost=false
    yourResult = tester.search("fig apricot orange lime apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apricot orange lime apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #510 checking search results for fig apricot orange lime apple with boost=false");
    // Test #511 checking search results for apple peach fig with boost=true
    yourResult = tester.search("apple peach fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #511 checking search results for apple peach fig with boost=true");
    // Test #512 checking search results for apple peach fig with boost=false
    yourResult = tester.search("apple peach fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #512 checking search results for apple peach fig with boost=false");
    // Test #513 checking search results for papaya tomato kiwi apricot coconut with boost=true
    yourResult = tester.search("papaya tomato kiwi apricot coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya tomato kiwi apricot coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #513 checking search results for papaya tomato kiwi apricot coconut with boost=true");
    // Test #514 checking search results for papaya tomato kiwi apricot coconut with boost=false
    yourResult = tester.search("papaya tomato kiwi apricot coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya tomato kiwi apricot coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #514 checking search results for papaya tomato kiwi apricot coconut with boost=false");
    // Test #515 checking search results for orange apricot apple papaya with boost=true
    yourResult = tester.search("orange apricot apple papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot apple papaya",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #515 checking search results for orange apricot apple papaya with boost=true");
    // Test #516 checking search results for orange apricot apple papaya with boost=false
    yourResult = tester.search("orange apricot apple papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot apple papaya",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #516 checking search results for orange apricot apple papaya with boost=false");
    // Test #517 checking search results for tomato apple peach fig with boost=true
    yourResult = tester.search("tomato apple peach fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #517 checking search results for tomato apple peach fig with boost=true");
    // Test #518 checking search results for tomato apple peach fig with boost=false
    yourResult = tester.search("tomato apple peach fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato apple peach fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #518 checking search results for tomato apple peach fig with boost=false");
    // Test #519 checking search results for pear kiwi apple lime cherry with boost=true
    yourResult = tester.search("pear kiwi apple lime cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear kiwi apple lime cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #519 checking search results for pear kiwi apple lime cherry with boost=true");
    // Test #520 checking search results for pear kiwi apple lime cherry with boost=false
    yourResult = tester.search("pear kiwi apple lime cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear kiwi apple lime cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #520 checking search results for pear kiwi apple lime cherry with boost=false");
    // Test #521 checking search results for apple fig peach with boost=true
    yourResult = tester.search("apple fig peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig peach",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #521 checking search results for apple fig peach with boost=true");
    // Test #522 checking search results for apple fig peach with boost=false
    yourResult = tester.search("apple fig peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig peach",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #522 checking search results for apple fig peach with boost=false");
    // Test #523 checking search results for apple cherry blueberry pear pear with boost=true
    yourResult = tester.search("apple cherry blueberry pear pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple cherry blueberry pear pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #523 checking search results for apple cherry blueberry pear pear with boost=true");
    // Test #524 checking search results for apple cherry blueberry pear pear with boost=false
    yourResult = tester.search("apple cherry blueberry pear pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple cherry blueberry pear pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #524 checking search results for apple cherry blueberry pear pear with boost=false");
    // Test #525 checking search results for lime lime apricot fig coconut with boost=true
    yourResult = tester.search("lime lime apricot fig coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime apricot fig coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #525 checking search results for lime lime apricot fig coconut with boost=true");
    // Test #526 checking search results for lime lime apricot fig coconut with boost=false
    yourResult = tester.search("lime lime apricot fig coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime apricot fig coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #526 checking search results for lime lime apricot fig coconut with boost=false");
    // Test #527 checking search results for apricot kiwi papaya coconut with boost=true
    yourResult = tester.search("apricot kiwi papaya coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot kiwi papaya coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #527 checking search results for apricot kiwi papaya coconut with boost=true");
    // Test #528 checking search results for apricot kiwi papaya coconut with boost=false
    yourResult = tester.search("apricot kiwi papaya coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot kiwi papaya coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #528 checking search results for apricot kiwi papaya coconut with boost=false");
    // Test #529 checking search results for fig cherry kiwi fig tomato with boost=true
    yourResult = tester.search("fig cherry kiwi fig tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig cherry kiwi fig tomato",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #529 checking search results for fig cherry kiwi fig tomato with boost=true");
    // Test #530 checking search results for fig cherry kiwi fig tomato with boost=false
    yourResult = tester.search("fig cherry kiwi fig tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig cherry kiwi fig tomato",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #530 checking search results for fig cherry kiwi fig tomato with boost=false");
    // Test #531 checking search results for apple kiwi orange apricot with boost=true
    yourResult = tester.search("apple kiwi orange apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple kiwi orange apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #531 checking search results for apple kiwi orange apricot with boost=true");
    // Test #532 checking search results for apple kiwi orange apricot with boost=false
    yourResult = tester.search("apple kiwi orange apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple kiwi orange apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #532 checking search results for apple kiwi orange apricot with boost=false");
    // Test #533 checking search results for blueberry apple lime cherry lime with boost=true
    yourResult = tester.search("blueberry apple lime cherry lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple lime cherry lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #533 checking search results for blueberry apple lime cherry lime with boost=true");
    // Test #534 checking search results for blueberry apple lime cherry lime with boost=false
    yourResult = tester.search("blueberry apple lime cherry lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple lime cherry lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #534 checking search results for blueberry apple lime cherry lime with boost=false");
    // Test #535 checking search results for apricot apple pear cherry coconut with boost=true
    yourResult = tester.search("apricot apple pear cherry coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot apple pear cherry coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #535 checking search results for apricot apple pear cherry coconut with boost=true");
    // Test #536 checking search results for apricot apple pear cherry coconut with boost=false
    yourResult = tester.search("apricot apple pear cherry coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot apple pear cherry coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #536 checking search results for apricot apple pear cherry coconut with boost=false");
    // Test #537 checking search results for tomato pear coconut blueberry pear with boost=true
    yourResult = tester.search("tomato pear coconut blueberry pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato pear coconut blueberry pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #537 checking search results for tomato pear coconut blueberry pear with boost=true");
    // Test #538 checking search results for tomato pear coconut blueberry pear with boost=false
    yourResult = tester.search("tomato pear coconut blueberry pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato pear coconut blueberry pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #538 checking search results for tomato pear coconut blueberry pear with boost=false");
    // Test #539 checking search results for papaya papaya orange coconut kiwi with boost=true
    yourResult = tester.search("papaya papaya orange coconut kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya papaya orange coconut kiwi",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #539 checking search results for papaya papaya orange coconut kiwi with boost=true");
    // Test #540 checking search results for papaya papaya orange coconut kiwi with boost=false
    yourResult = tester.search("papaya papaya orange coconut kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya papaya orange coconut kiwi",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #540 checking search results for papaya papaya orange coconut kiwi with boost=false");
    // Test #541 checking search results for pear pear blueberry apple apricot with boost=true
    yourResult = tester.search("pear pear blueberry apple apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear pear blueberry apple apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #541 checking search results for pear pear blueberry apple apricot with boost=true");
    // Test #542 checking search results for pear pear blueberry apple apricot with boost=false
    yourResult = tester.search("pear pear blueberry apple apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear pear blueberry apple apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #542 checking search results for pear pear blueberry apple apricot with boost=false");
    // Test #543 checking search results for fig tomato peach apple with boost=true
    yourResult = tester.search("fig tomato peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig tomato peach apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #543 checking search results for fig tomato peach apple with boost=true");
    // Test #544 checking search results for fig tomato peach apple with boost=false
    yourResult = tester.search("fig tomato peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig tomato peach apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #544 checking search results for fig tomato peach apple with boost=false");
    // Test #545 checking search results for orange apricot papaya apple with boost=true
    yourResult = tester.search("orange apricot papaya apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot papaya apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #545 checking search results for orange apricot papaya apple with boost=true");
    // Test #546 checking search results for orange apricot papaya apple with boost=false
    yourResult = tester.search("orange apricot papaya apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot papaya apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #546 checking search results for orange apricot papaya apple with boost=false");
    // Test #547 checking search results for peach coconut cherry kiwi lime with boost=true
    yourResult = tester.search("peach coconut cherry kiwi lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut cherry kiwi lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #547 checking search results for peach coconut cherry kiwi lime with boost=true");
    // Test #548 checking search results for peach coconut cherry kiwi lime with boost=false
    yourResult = tester.search("peach coconut cherry kiwi lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut cherry kiwi lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #548 checking search results for peach coconut cherry kiwi lime with boost=false");
    // Test #549 checking search results for coconut kiwi pear peach cherry with boost=true
    yourResult = tester.search("coconut kiwi pear peach cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi pear peach cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #549 checking search results for coconut kiwi pear peach cherry with boost=true");
    // Test #550 checking search results for coconut kiwi pear peach cherry with boost=false
    yourResult = tester.search("coconut kiwi pear peach cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi pear peach cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #550 checking search results for coconut kiwi pear peach cherry with boost=false");
    // Test #551 checking search results for lime apricot kiwi cherry pear with boost=true
    yourResult = tester.search("lime apricot kiwi cherry pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apricot kiwi cherry pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #551 checking search results for lime apricot kiwi cherry pear with boost=true");
    // Test #552 checking search results for lime apricot kiwi cherry pear with boost=false
    yourResult = tester.search("lime apricot kiwi cherry pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apricot kiwi cherry pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #552 checking search results for lime apricot kiwi cherry pear with boost=false");
    // Test #553 checking search results for peach apple fig with boost=true
    yourResult = tester.search("peach apple fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #553 checking search results for peach apple fig with boost=true");
    // Test #554 checking search results for peach apple fig with boost=false
    yourResult = tester.search("peach apple fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #554 checking search results for peach apple fig with boost=false");
    // Test #555 checking search results for pear lime lime coconut fig with boost=true
    yourResult = tester.search("pear lime lime coconut fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime lime coconut fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #555 checking search results for pear lime lime coconut fig with boost=true");
    // Test #556 checking search results for pear lime lime coconut fig with boost=false
    yourResult = tester.search("pear lime lime coconut fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime lime coconut fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #556 checking search results for pear lime lime coconut fig with boost=false");
    // Test #557 checking search results for kiwi pear lime coconut lime with boost=true
    yourResult = tester.search("kiwi pear lime coconut lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear lime coconut lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #557 checking search results for kiwi pear lime coconut lime with boost=true");
    // Test #558 checking search results for kiwi pear lime coconut lime with boost=false
    yourResult = tester.search("kiwi pear lime coconut lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear lime coconut lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #558 checking search results for kiwi pear lime coconut lime with boost=false");
    // Test #559 checking search results for tomato cherry fig kiwi fig with boost=true
    yourResult = tester.search("tomato cherry fig kiwi fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry fig kiwi fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #559 checking search results for tomato cherry fig kiwi fig with boost=true");
    // Test #560 checking search results for tomato cherry fig kiwi fig with boost=false
    yourResult = tester.search("tomato cherry fig kiwi fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry fig kiwi fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #560 checking search results for tomato cherry fig kiwi fig with boost=false");
    // Test #561 checking search results for orange apple coconut lime lime with boost=true
    yourResult = tester.search("orange apple coconut lime lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple coconut lime lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #561 checking search results for orange apple coconut lime lime with boost=true");
    // Test #562 checking search results for orange apple coconut lime lime with boost=false
    yourResult = tester.search("orange apple coconut lime lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple coconut lime lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #562 checking search results for orange apple coconut lime lime with boost=false");
    // Test #563 checking search results for cherry orange kiwi pear fig with boost=true
    yourResult = tester.search("cherry orange kiwi pear fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange kiwi pear fig",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #563 checking search results for cherry orange kiwi pear fig with boost=true");
    // Test #564 checking search results for cherry orange kiwi pear fig with boost=false
    yourResult = tester.search("cherry orange kiwi pear fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry orange kiwi pear fig",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #564 checking search results for cherry orange kiwi pear fig with boost=false");
    // Test #565 checking search results for coconut apricot lime fig lime with boost=true
    yourResult = tester.search("coconut apricot lime fig lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apricot lime fig lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #565 checking search results for coconut apricot lime fig lime with boost=true");
    // Test #566 checking search results for coconut apricot lime fig lime with boost=false
    yourResult = tester.search("coconut apricot lime fig lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apricot lime fig lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #566 checking search results for coconut apricot lime fig lime with boost=false");
    // Test #567 checking search results for blueberry pear apple kiwi pear with boost=true
    yourResult = tester.search("blueberry pear apple kiwi pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry pear apple kiwi pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #567 checking search results for blueberry pear apple kiwi pear with boost=true");
    // Test #568 checking search results for blueberry pear apple kiwi pear with boost=false
    yourResult = tester.search("blueberry pear apple kiwi pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry pear apple kiwi pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #568 checking search results for blueberry pear apple kiwi pear with boost=false");
    // Test #569 checking search results for lime apricot kiwi cherry pear with boost=true
    yourResult = tester.search("lime apricot kiwi cherry pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apricot kiwi cherry pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #569 checking search results for lime apricot kiwi cherry pear with boost=true");
    // Test #570 checking search results for lime apricot kiwi cherry pear with boost=false
    yourResult = tester.search("lime apricot kiwi cherry pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apricot kiwi cherry pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #570 checking search results for lime apricot kiwi cherry pear with boost=false");
    // Test #571 checking search results for apple cherry orange coconut kiwi with boost=true
    yourResult = tester.search("apple cherry orange coconut kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple cherry orange coconut kiwi",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #571 checking search results for apple cherry orange coconut kiwi with boost=true");
    // Test #572 checking search results for apple cherry orange coconut kiwi with boost=false
    yourResult = tester.search("apple cherry orange coconut kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple cherry orange coconut kiwi",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #572 checking search results for apple cherry orange coconut kiwi with boost=false");
    // Test #573 checking search results for blueberry cherry pear coconut with boost=true
    yourResult = tester.search("blueberry cherry pear coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry pear coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #573 checking search results for blueberry cherry pear coconut with boost=true");
    // Test #574 checking search results for blueberry cherry pear coconut with boost=false
    yourResult = tester.search("blueberry cherry pear coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry pear coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #574 checking search results for blueberry cherry pear coconut with boost=false");
    // Test #575 checking search results for lime lime cherry pear coconut with boost=true
    yourResult = tester.search("lime lime cherry pear coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime cherry pear coconut",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #575 checking search results for lime lime cherry pear coconut with boost=true");
    // Test #576 checking search results for lime lime cherry pear coconut with boost=false
    yourResult = tester.search("lime lime cherry pear coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime cherry pear coconut",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #576 checking search results for lime lime cherry pear coconut with boost=false");
    // Test #577 checking search results for coconut apricot blueberry orange with boost=true
    yourResult = tester.search("coconut apricot blueberry orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apricot blueberry orange",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #577 checking search results for coconut apricot blueberry orange with boost=true");
    // Test #578 checking search results for coconut apricot blueberry orange with boost=false
    yourResult = tester.search("coconut apricot blueberry orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apricot blueberry orange",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #578 checking search results for coconut apricot blueberry orange with boost=false");
    // Test #579 checking search results for coconut lime apricot fig lime with boost=true
    yourResult = tester.search("coconut lime apricot fig lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime apricot fig lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #579 checking search results for coconut lime apricot fig lime with boost=true");
    // Test #580 checking search results for coconut lime apricot fig lime with boost=false
    yourResult = tester.search("coconut lime apricot fig lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime apricot fig lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #580 checking search results for coconut lime apricot fig lime with boost=false");
    // Test #581 checking search results for kiwi pear cherry lime apple with boost=true
    yourResult = tester.search("kiwi pear cherry lime apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear cherry lime apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #581 checking search results for kiwi pear cherry lime apple with boost=true");
    // Test #582 checking search results for kiwi pear cherry lime apple with boost=false
    yourResult = tester.search("kiwi pear cherry lime apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi pear cherry lime apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #582 checking search results for kiwi pear cherry lime apple with boost=false");
    // Test #583 checking search results for coconut papaya papaya pear cherry with boost=true
    yourResult = tester.search("coconut papaya papaya pear cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya papaya pear cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #583 checking search results for coconut papaya papaya pear cherry with boost=true");
    // Test #584 checking search results for coconut papaya papaya pear cherry with boost=false
    yourResult = tester.search("coconut papaya papaya pear cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya papaya pear cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #584 checking search results for coconut papaya papaya pear cherry with boost=false");
    // Test #585 checking search results for tomato blueberry coconut pear cherry with boost=true
    yourResult = tester.search("tomato blueberry coconut pear cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato blueberry coconut pear cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #585 checking search results for tomato blueberry coconut pear cherry with boost=true");
    // Test #586 checking search results for tomato blueberry coconut pear cherry with boost=false
    yourResult = tester.search("tomato blueberry coconut pear cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato blueberry coconut pear cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #586 checking search results for tomato blueberry coconut pear cherry with boost=false");
    // Test #587 checking search results for cherry apple pear blueberry lime with boost=true
    yourResult = tester.search("cherry apple pear blueberry lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apple pear blueberry lime",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #587 checking search results for cherry apple pear blueberry lime with boost=true");
    // Test #588 checking search results for cherry apple pear blueberry lime with boost=false
    yourResult = tester.search("cherry apple pear blueberry lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apple pear blueberry lime",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #588 checking search results for cherry apple pear blueberry lime with boost=false");
    // Test #589 checking search results for orange coconut blueberry apricot with boost=true
    yourResult = tester.search("orange coconut blueberry apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange coconut blueberry apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #589 checking search results for orange coconut blueberry apricot with boost=true");
    // Test #590 checking search results for orange coconut blueberry apricot with boost=false
    yourResult = tester.search("orange coconut blueberry apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange coconut blueberry apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #590 checking search results for orange coconut blueberry apricot with boost=false");
    // Test #591 checking search results for apple tomato fig tomato peach with boost=true
    yourResult = tester.search("apple tomato fig tomato peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato fig tomato peach",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #591 checking search results for apple tomato fig tomato peach with boost=true");
    // Test #592 checking search results for apple tomato fig tomato peach with boost=false
    yourResult = tester.search("apple tomato fig tomato peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple tomato fig tomato peach",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #592 checking search results for apple tomato fig tomato peach with boost=false");
    // Test #593 checking search results for banana kiwi banana orange banana with boost=true
    yourResult = tester.search("banana kiwi banana orange banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana kiwi banana orange banana",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #593 checking search results for banana kiwi banana orange banana with boost=true");
    // Test #594 checking search results for banana kiwi banana orange banana with boost=false
    yourResult = tester.search("banana kiwi banana orange banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana kiwi banana orange banana",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #594 checking search results for banana kiwi banana orange banana with boost=false");
    // Test #595 checking search results for pear lime kiwi cherry apricot with boost=true
    yourResult = tester.search("pear lime kiwi cherry apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime kiwi cherry apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #595 checking search results for pear lime kiwi cherry apricot with boost=true");
    // Test #596 checking search results for pear lime kiwi cherry apricot with boost=false
    yourResult = tester.search("pear lime kiwi cherry apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime kiwi cherry apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #596 checking search results for pear lime kiwi cherry apricot with boost=false");
    // Test #597 checking search results for pear orange apple papaya papaya with boost=true
    yourResult = tester.search("pear orange apple papaya papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange apple papaya papaya",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #597 checking search results for pear orange apple papaya papaya with boost=true");
    // Test #598 checking search results for pear orange apple papaya papaya with boost=false
    yourResult = tester.search("pear orange apple papaya papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange apple papaya papaya",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #598 checking search results for pear orange apple papaya papaya with boost=false");
    // Test #599 checking search results for peach coconut fig apricot orange with boost=true
    yourResult = tester.search("peach coconut fig apricot orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut fig apricot orange",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #599 checking search results for peach coconut fig apricot orange with boost=true");
    // Test #600 checking search results for peach coconut fig apricot orange with boost=false
    yourResult = tester.search("peach coconut fig apricot orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut fig apricot orange",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #600 checking search results for peach coconut fig apricot orange with boost=false");
    // Test #601 checking search results for pear fig pear apple cherry with boost=true
    yourResult = tester.search("pear fig pear apple cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear fig pear apple cherry",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #601 checking search results for pear fig pear apple cherry with boost=true");
    // Test #602 checking search results for pear fig pear apple cherry with boost=false
    yourResult = tester.search("pear fig pear apple cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear fig pear apple cherry",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #602 checking search results for pear fig pear apple cherry with boost=false");
    // Test #603 checking search results for kiwi apricot apple pear with boost=true
    yourResult = tester.search("kiwi apricot apple pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apricot apple pear",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #603 checking search results for kiwi apricot apple pear with boost=true");
    // Test #604 checking search results for kiwi apricot apple pear with boost=false
    yourResult = tester.search("kiwi apricot apple pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apricot apple pear",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #604 checking search results for kiwi apricot apple pear with boost=false");
    // Test #605 checking search results for lime lime blueberry lime apricot with boost=true
    yourResult = tester.search("lime lime blueberry lime apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime blueberry lime apricot",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #605 checking search results for lime lime blueberry lime apricot with boost=true");
    // Test #606 checking search results for lime lime blueberry lime apricot with boost=false
    yourResult = tester.search("lime lime blueberry lime apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime lime blueberry lime apricot",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #606 checking search results for lime lime blueberry lime apricot with boost=false");
    // Test #607 checking search results for lime pear kiwi cherry apple with boost=true
    yourResult = tester.search("lime pear kiwi cherry apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime pear kiwi cherry apple",
        true,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #607 checking search results for lime pear kiwi cherry apple with boost=true");
    // Test #608 checking search results for lime pear kiwi cherry apple with boost=false
    yourResult = tester.search("lime pear kiwi cherry apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime pear kiwi cherry apple",
        false,
        passOut,
        failOut,
        "Fruits4SearchTester",
        "Test #608 checking search results for lime pear kiwi cherry apple with boost=false");
    failOut.close();
    passOut.close();
  }
}
