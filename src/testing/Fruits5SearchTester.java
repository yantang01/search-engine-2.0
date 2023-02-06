package testing;

import model.ProjectTester;
import model.ProjectTesterImp;
import model.SearchResult;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Fruits5SearchTester {
  public static void main(String[] args) throws Exception {
    ProjectTester tester =
        new ProjectTesterImp(); // Instantiate your own ProjectTester instance here
    tester.initialize();
    tester.crawl("https://people.scs.carleton.ca/~davidmckenney/fruits5/N-0.html");
    runTest(tester);
  }

  public static void runTest(ProjectTester tester) throws Exception {
    PrintWriter failOut = new PrintWriter(new FileWriter("Fruits5-Search-failed.txt"));
    PrintWriter passOut = new PrintWriter(new FileWriter("Fruits5-Search-passed.txt"));
    List<SearchResult> yourResult;
    // Test #409 checking search results for peach banana apple apple cherry with boost=true
    yourResult = tester.search("peach banana apple apple cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple apple cherry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #409 checking search results for peach banana apple apple cherry with boost=true");
    // Test #410 checking search results for peach banana apple apple cherry with boost=false
    yourResult = tester.search("peach banana apple apple cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana apple apple cherry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #410 checking search results for peach banana apple apple cherry with boost=false");
    // Test #411 checking search results for blueberry peach peach kiwi apricot with boost=true
    yourResult = tester.search("blueberry peach peach kiwi apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry peach peach kiwi apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #411 checking search results for blueberry peach peach kiwi apricot with boost=true");
    // Test #412 checking search results for blueberry peach peach kiwi apricot with boost=false
    yourResult = tester.search("blueberry peach peach kiwi apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry peach peach kiwi apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #412 checking search results for blueberry peach peach kiwi apricot with boost=false");
    // Test #413 checking search results for pear coconut kiwi coconut with boost=true
    yourResult = tester.search("pear coconut kiwi coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear coconut kiwi coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #413 checking search results for pear coconut kiwi coconut with boost=true");
    // Test #414 checking search results for pear coconut kiwi coconut with boost=false
    yourResult = tester.search("pear coconut kiwi coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear coconut kiwi coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #414 checking search results for pear coconut kiwi coconut with boost=false");
    // Test #415 checking search results for pear lime pear apricot apple with boost=true
    yourResult = tester.search("pear lime pear apricot apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime pear apricot apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #415 checking search results for pear lime pear apricot apple with boost=true");
    // Test #416 checking search results for pear lime pear apricot apple with boost=false
    yourResult = tester.search("pear lime pear apricot apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime pear apricot apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #416 checking search results for pear lime pear apricot apple with boost=false");
    // Test #417 checking search results for cherry apricot papaya apricot apricot with boost=true
    yourResult = tester.search("cherry apricot papaya apricot apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apricot papaya apricot apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #417 checking search results for cherry apricot papaya apricot apricot with boost=true");
    // Test #418 checking search results for cherry apricot papaya apricot apricot with boost=false
    yourResult = tester.search("cherry apricot papaya apricot apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apricot papaya apricot apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #418 checking search results for cherry apricot papaya apricot apricot with boost=false");
    // Test #419 checking search results for banana blueberry tomato apple coconut with boost=true
    yourResult = tester.search("banana blueberry tomato apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana blueberry tomato apple coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #419 checking search results for banana blueberry tomato apple coconut with boost=true");
    // Test #420 checking search results for banana blueberry tomato apple coconut with boost=false
    yourResult = tester.search("banana blueberry tomato apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana blueberry tomato apple coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #420 checking search results for banana blueberry tomato apple coconut with boost=false");
    // Test #421 checking search results for blueberry banana coconut apple with boost=true
    yourResult = tester.search("blueberry banana coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry banana coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #421 checking search results for blueberry banana coconut apple with boost=true");
    // Test #422 checking search results for blueberry banana coconut apple with boost=false
    yourResult = tester.search("blueberry banana coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry banana coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #422 checking search results for blueberry banana coconut apple with boost=false");
    // Test #423 checking search results for papaya pear apple peach apple with boost=true
    yourResult = tester.search("papaya pear apple peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya pear apple peach apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #423 checking search results for papaya pear apple peach apple with boost=true");
    // Test #424 checking search results for papaya pear apple peach apple with boost=false
    yourResult = tester.search("papaya pear apple peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya pear apple peach apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #424 checking search results for papaya pear apple peach apple with boost=false");
    // Test #425 checking search results for pear coconut apricot pear coconut with boost=true
    yourResult = tester.search("pear coconut apricot pear coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear coconut apricot pear coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #425 checking search results for pear coconut apricot pear coconut with boost=true");
    // Test #426 checking search results for pear coconut apricot pear coconut with boost=false
    yourResult = tester.search("pear coconut apricot pear coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear coconut apricot pear coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #426 checking search results for pear coconut apricot pear coconut with boost=false");
    // Test #427 checking search results for banana blueberry coconut apple with boost=true
    yourResult = tester.search("banana blueberry coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana blueberry coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #427 checking search results for banana blueberry coconut apple with boost=true");
    // Test #428 checking search results for banana blueberry coconut apple with boost=false
    yourResult = tester.search("banana blueberry coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana blueberry coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #428 checking search results for banana blueberry coconut apple with boost=false");
    // Test #429 checking search results for orange coconut pear coconut papaya with boost=true
    yourResult = tester.search("orange coconut pear coconut papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange coconut pear coconut papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #429 checking search results for orange coconut pear coconut papaya with boost=true");
    // Test #430 checking search results for orange coconut pear coconut papaya with boost=false
    yourResult = tester.search("orange coconut pear coconut papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange coconut pear coconut papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #430 checking search results for orange coconut pear coconut papaya with boost=false");
    // Test #431 checking search results for blueberry cherry pear apricot apricot with boost=true
    yourResult = tester.search("blueberry cherry pear apricot apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry pear apricot apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #431 checking search results for blueberry cherry pear apricot apricot with boost=true");
    // Test #432 checking search results for blueberry cherry pear apricot apricot with boost=false
    yourResult = tester.search("blueberry cherry pear apricot apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry pear apricot apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #432 checking search results for blueberry cherry pear apricot apricot with boost=false");
    // Test #433 checking search results for banana lime fig apple banana with boost=true
    yourResult = tester.search("banana lime fig apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana lime fig apple banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #433 checking search results for banana lime fig apple banana with boost=true");
    // Test #434 checking search results for banana lime fig apple banana with boost=false
    yourResult = tester.search("banana lime fig apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana lime fig apple banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #434 checking search results for banana lime fig apple banana with boost=false");
    // Test #435 checking search results for coconut coconut apricot peach apple with boost=true
    yourResult = tester.search("coconut coconut apricot peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut apricot peach apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #435 checking search results for coconut coconut apricot peach apple with boost=true");
    // Test #436 checking search results for coconut coconut apricot peach apple with boost=false
    yourResult = tester.search("coconut coconut apricot peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut apricot peach apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #436 checking search results for coconut coconut apricot peach apple with boost=false");
    // Test #437 checking search results for kiwi kiwi coconut blueberry orange with boost=true
    yourResult = tester.search("kiwi kiwi coconut blueberry orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi kiwi coconut blueberry orange",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #437 checking search results for kiwi kiwi coconut blueberry orange with boost=true");
    // Test #438 checking search results for kiwi kiwi coconut blueberry orange with boost=false
    yourResult = tester.search("kiwi kiwi coconut blueberry orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi kiwi coconut blueberry orange",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #438 checking search results for kiwi kiwi coconut blueberry orange with boost=false");
    // Test #439 checking search results for apricot pear peach apple pear with boost=true
    yourResult = tester.search("apricot pear peach apple pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot pear peach apple pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #439 checking search results for apricot pear peach apple pear with boost=true");
    // Test #440 checking search results for apricot pear peach apple pear with boost=false
    yourResult = tester.search("apricot pear peach apple pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot pear peach apple pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #440 checking search results for apricot pear peach apple pear with boost=false");
    // Test #441 checking search results for kiwi apple peach coconut apple with boost=true
    yourResult = tester.search("kiwi apple peach coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apple peach coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #441 checking search results for kiwi apple peach coconut apple with boost=true");
    // Test #442 checking search results for kiwi apple peach coconut apple with boost=false
    yourResult = tester.search("kiwi apple peach coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apple peach coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #442 checking search results for kiwi apple peach coconut apple with boost=false");
    // Test #443 checking search results for kiwi coconut coconut pear with boost=true
    yourResult = tester.search("kiwi coconut coconut pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut coconut pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #443 checking search results for kiwi coconut coconut pear with boost=true");
    // Test #444 checking search results for kiwi coconut coconut pear with boost=false
    yourResult = tester.search("kiwi coconut coconut pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut coconut pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #444 checking search results for kiwi coconut coconut pear with boost=false");
    // Test #445 checking search results for orange lime coconut papaya orange with boost=true
    yourResult = tester.search("orange lime coconut papaya orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime coconut papaya orange",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #445 checking search results for orange lime coconut papaya orange with boost=true");
    // Test #446 checking search results for orange lime coconut papaya orange with boost=false
    yourResult = tester.search("orange lime coconut papaya orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime coconut papaya orange",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #446 checking search results for orange lime coconut papaya orange with boost=false");
    // Test #447 checking search results for coconut lime kiwi coconut apple with boost=true
    yourResult = tester.search("coconut lime kiwi coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime kiwi coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #447 checking search results for coconut lime kiwi coconut apple with boost=true");
    // Test #448 checking search results for coconut lime kiwi coconut apple with boost=false
    yourResult = tester.search("coconut lime kiwi coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime kiwi coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #448 checking search results for coconut lime kiwi coconut apple with boost=false");
    // Test #449 checking search results for coconut coconut pear kiwi with boost=true
    yourResult = tester.search("coconut coconut pear kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut pear kiwi",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #449 checking search results for coconut coconut pear kiwi with boost=true");
    // Test #450 checking search results for coconut coconut pear kiwi with boost=false
    yourResult = tester.search("coconut coconut pear kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut pear kiwi",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #450 checking search results for coconut coconut pear kiwi with boost=false");
    // Test #451 checking search results for blueberry tomato peach banana peach with boost=true
    yourResult = tester.search("blueberry tomato peach banana peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry tomato peach banana peach",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #451 checking search results for blueberry tomato peach banana peach with boost=true");
    // Test #452 checking search results for blueberry tomato peach banana peach with boost=false
    yourResult = tester.search("blueberry tomato peach banana peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry tomato peach banana peach",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #452 checking search results for blueberry tomato peach banana peach with boost=false");
    // Test #453 checking search results for orange peach peach blueberry banana with boost=true
    yourResult = tester.search("orange peach peach blueberry banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach peach blueberry banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #453 checking search results for orange peach peach blueberry banana with boost=true");
    // Test #454 checking search results for orange peach peach blueberry banana with boost=false
    yourResult = tester.search("orange peach peach blueberry banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach peach blueberry banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #454 checking search results for orange peach peach blueberry banana with boost=false");
    // Test #455 checking search results for orange apple lime apple blueberry with boost=true
    yourResult = tester.search("orange apple lime apple blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple lime apple blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #455 checking search results for orange apple lime apple blueberry with boost=true");
    // Test #456 checking search results for orange apple lime apple blueberry with boost=false
    yourResult = tester.search("orange apple lime apple blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple lime apple blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #456 checking search results for orange apple lime apple blueberry with boost=false");
    // Test #457 checking search results for pear peach pear apricot apple with boost=true
    yourResult = tester.search("pear peach pear apricot apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear peach pear apricot apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #457 checking search results for pear peach pear apricot apple with boost=true");
    // Test #458 checking search results for pear peach pear apricot apple with boost=false
    yourResult = tester.search("pear peach pear apricot apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear peach pear apricot apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #458 checking search results for pear peach pear apricot apple with boost=false");
    // Test #459 checking search results for apple coconut apricot coconut peach with boost=true
    yourResult = tester.search("apple coconut apricot coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apricot coconut peach",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #459 checking search results for apple coconut apricot coconut peach with boost=true");
    // Test #460 checking search results for apple coconut apricot coconut peach with boost=false
    yourResult = tester.search("apple coconut apricot coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apricot coconut peach",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #460 checking search results for apple coconut apricot coconut peach with boost=false");
    // Test #461 checking search results for orange coconut orange pear orange with boost=true
    yourResult = tester.search("orange coconut orange pear orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange coconut orange pear orange",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #461 checking search results for orange coconut orange pear orange with boost=true");
    // Test #462 checking search results for orange coconut orange pear orange with boost=false
    yourResult = tester.search("orange coconut orange pear orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange coconut orange pear orange",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #462 checking search results for orange coconut orange pear orange with boost=false");
    // Test #463 checking search results for apple banana blueberry coconut tomato with boost=true
    yourResult = tester.search("apple banana blueberry coconut tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana blueberry coconut tomato",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #463 checking search results for apple banana blueberry coconut tomato with boost=true");
    // Test #464 checking search results for apple banana blueberry coconut tomato with boost=false
    yourResult = tester.search("apple banana blueberry coconut tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple banana blueberry coconut tomato",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #464 checking search results for apple banana blueberry coconut tomato with boost=false");
    // Test #465 checking search results for coconut banana apple blueberry with boost=true
    yourResult = tester.search("coconut banana apple blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut banana apple blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #465 checking search results for coconut banana apple blueberry with boost=true");
    // Test #466 checking search results for coconut banana apple blueberry with boost=false
    yourResult = tester.search("coconut banana apple blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut banana apple blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #466 checking search results for coconut banana apple blueberry with boost=false");
    // Test #467 checking search results for peach pear peach blueberry cherry with boost=true
    yourResult = tester.search("peach pear peach blueberry cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear peach blueberry cherry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #467 checking search results for peach pear peach blueberry cherry with boost=true");
    // Test #468 checking search results for peach pear peach blueberry cherry with boost=false
    yourResult = tester.search("peach pear peach blueberry cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear peach blueberry cherry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #468 checking search results for peach pear peach blueberry cherry with boost=false");
    // Test #469 checking search results for apple peach pear apple papaya with boost=true
    yourResult = tester.search("apple peach pear apple papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach pear apple papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #469 checking search results for apple peach pear apple papaya with boost=true");
    // Test #470 checking search results for apple peach pear apple papaya with boost=false
    yourResult = tester.search("apple peach pear apple papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach pear apple papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #470 checking search results for apple peach pear apple papaya with boost=false");
    // Test #471 checking search results for banana apricot apricot blueberry papaya with boost=true
    yourResult = tester.search("banana apricot apricot blueberry papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apricot apricot blueberry papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #471 checking search results for banana apricot apricot blueberry papaya with boost=true");
    // Test #472 checking search results for banana apricot apricot blueberry papaya with
    // boost=false
    yourResult = tester.search("banana apricot apricot blueberry papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana apricot apricot blueberry papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #472 checking search results for banana apricot apricot blueberry papaya with boost=false");
    // Test #473 checking search results for cherry peach pear blueberry peach with boost=true
    yourResult = tester.search("cherry peach pear blueberry peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach pear blueberry peach",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #473 checking search results for cherry peach pear blueberry peach with boost=true");
    // Test #474 checking search results for cherry peach pear blueberry peach with boost=false
    yourResult = tester.search("cherry peach pear blueberry peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach pear blueberry peach",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #474 checking search results for cherry peach pear blueberry peach with boost=false");
    // Test #475 checking search results for apple apple orange blueberry lime with boost=true
    yourResult = tester.search("apple apple orange blueberry lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple orange blueberry lime",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #475 checking search results for apple apple orange blueberry lime with boost=true");
    // Test #476 checking search results for apple apple orange blueberry lime with boost=false
    yourResult = tester.search("apple apple orange blueberry lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple orange blueberry lime",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #476 checking search results for apple apple orange blueberry lime with boost=false");
    // Test #477 checking search results for orange blueberry kiwi coconut kiwi with boost=true
    yourResult = tester.search("orange blueberry kiwi coconut kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange blueberry kiwi coconut kiwi",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #477 checking search results for orange blueberry kiwi coconut kiwi with boost=true");
    // Test #478 checking search results for orange blueberry kiwi coconut kiwi with boost=false
    yourResult = tester.search("orange blueberry kiwi coconut kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange blueberry kiwi coconut kiwi",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #478 checking search results for orange blueberry kiwi coconut kiwi with boost=false");
    // Test #479 checking search results for blueberry apricot apple blueberry coconut with
    // boost=true
    yourResult = tester.search("blueberry apricot apple blueberry coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apricot apple blueberry coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #479 checking search results for blueberry apricot apple blueberry coconut with boost=true");
    // Test #480 checking search results for blueberry apricot apple blueberry coconut with
    // boost=false
    yourResult = tester.search("blueberry apricot apple blueberry coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apricot apple blueberry coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #480 checking search results for blueberry apricot apple blueberry coconut with boost=false");
    // Test #481 checking search results for coconut apple kiwi lime coconut with boost=true
    yourResult = tester.search("coconut apple kiwi lime coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple kiwi lime coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #481 checking search results for coconut apple kiwi lime coconut with boost=true");
    // Test #482 checking search results for coconut apple kiwi lime coconut with boost=false
    yourResult = tester.search("coconut apple kiwi lime coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple kiwi lime coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #482 checking search results for coconut apple kiwi lime coconut with boost=false");
    // Test #483 checking search results for peach pear pear apple apricot with boost=true
    yourResult = tester.search("peach pear pear apple apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear pear apple apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #483 checking search results for peach pear pear apple apricot with boost=true");
    // Test #484 checking search results for peach pear pear apple apricot with boost=false
    yourResult = tester.search("peach pear pear apple apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach pear pear apple apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #484 checking search results for peach pear pear apple apricot with boost=false");
    // Test #485 checking search results for coconut kiwi pear coconut with boost=true
    yourResult = tester.search("coconut kiwi pear coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi pear coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #485 checking search results for coconut kiwi pear coconut with boost=true");
    // Test #486 checking search results for coconut kiwi pear coconut with boost=false
    yourResult = tester.search("coconut kiwi pear coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi pear coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #486 checking search results for coconut kiwi pear coconut with boost=false");
    // Test #487 checking search results for blueberry banana coconut apple with boost=true
    yourResult = tester.search("blueberry banana coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry banana coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #487 checking search results for blueberry banana coconut apple with boost=true");
    // Test #488 checking search results for blueberry banana coconut apple with boost=false
    yourResult = tester.search("blueberry banana coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry banana coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #488 checking search results for blueberry banana coconut apple with boost=false");
    // Test #489 checking search results for coconut coconut kiwi pear with boost=true
    yourResult = tester.search("coconut coconut kiwi pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut kiwi pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #489 checking search results for coconut coconut kiwi pear with boost=true");
    // Test #490 checking search results for coconut coconut kiwi pear with boost=false
    yourResult = tester.search("coconut coconut kiwi pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut kiwi pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #490 checking search results for coconut coconut kiwi pear with boost=false");
    // Test #491 checking search results for apple fig apple cherry papaya with boost=true
    yourResult = tester.search("apple fig apple cherry papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig apple cherry papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #491 checking search results for apple fig apple cherry papaya with boost=true");
    // Test #492 checking search results for apple fig apple cherry papaya with boost=false
    yourResult = tester.search("apple fig apple cherry papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig apple cherry papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #492 checking search results for apple fig apple cherry papaya with boost=false");
    // Test #493 checking search results for fig cherry coconut coconut apple with boost=true
    yourResult = tester.search("fig cherry coconut coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig cherry coconut coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #493 checking search results for fig cherry coconut coconut apple with boost=true");
    // Test #494 checking search results for fig cherry coconut coconut apple with boost=false
    yourResult = tester.search("fig cherry coconut coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig cherry coconut coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #494 checking search results for fig cherry coconut coconut apple with boost=false");
    // Test #495 checking search results for apple coconut peach apple orange with boost=true
    yourResult = tester.search("apple coconut peach apple orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach apple orange",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #495 checking search results for apple coconut peach apple orange with boost=true");
    // Test #496 checking search results for apple coconut peach apple orange with boost=false
    yourResult = tester.search("apple coconut peach apple orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut peach apple orange",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #496 checking search results for apple coconut peach apple orange with boost=false");
    // Test #497 checking search results for apricot pear coconut orange coconut with boost=true
    yourResult = tester.search("apricot pear coconut orange coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot pear coconut orange coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #497 checking search results for apricot pear coconut orange coconut with boost=true");
    // Test #498 checking search results for apricot pear coconut orange coconut with boost=false
    yourResult = tester.search("apricot pear coconut orange coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot pear coconut orange coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #498 checking search results for apricot pear coconut orange coconut with boost=false");
    // Test #499 checking search results for coconut coconut papaya orange pear with boost=true
    yourResult = tester.search("coconut coconut papaya orange pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut papaya orange pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #499 checking search results for coconut coconut papaya orange pear with boost=true");
    // Test #500 checking search results for coconut coconut papaya orange pear with boost=false
    yourResult = tester.search("coconut coconut papaya orange pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut papaya orange pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #500 checking search results for coconut coconut papaya orange pear with boost=false");
    // Test #501 checking search results for coconut pear papaya coconut blueberry with boost=true
    yourResult = tester.search("coconut pear papaya coconut blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut pear papaya coconut blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #501 checking search results for coconut pear papaya coconut blueberry with boost=true");
    // Test #502 checking search results for coconut pear papaya coconut blueberry with boost=false
    yourResult = tester.search("coconut pear papaya coconut blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut pear papaya coconut blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #502 checking search results for coconut pear papaya coconut blueberry with boost=false");
    // Test #503 checking search results for pear apple apricot pear peach with boost=true
    yourResult = tester.search("pear apple apricot pear peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear apple apricot pear peach",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #503 checking search results for pear apple apricot pear peach with boost=true");
    // Test #504 checking search results for pear apple apricot pear peach with boost=false
    yourResult = tester.search("pear apple apricot pear peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear apple apricot pear peach",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #504 checking search results for pear apple apricot pear peach with boost=false");
    // Test #505 checking search results for blueberry cherry pear apricot apricot with boost=true
    yourResult = tester.search("blueberry cherry pear apricot apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry pear apricot apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #505 checking search results for blueberry cherry pear apricot apricot with boost=true");
    // Test #506 checking search results for blueberry cherry pear apricot apricot with boost=false
    yourResult = tester.search("blueberry cherry pear apricot apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry pear apricot apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #506 checking search results for blueberry cherry pear apricot apricot with boost=false");
    // Test #507 checking search results for coconut kiwi coconut tomato pear with boost=true
    yourResult = tester.search("coconut kiwi coconut tomato pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi coconut tomato pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #507 checking search results for coconut kiwi coconut tomato pear with boost=true");
    // Test #508 checking search results for coconut kiwi coconut tomato pear with boost=false
    yourResult = tester.search("coconut kiwi coconut tomato pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi coconut tomato pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #508 checking search results for coconut kiwi coconut tomato pear with boost=false");
    // Test #509 checking search results for pear coconut blueberry coconut papaya with boost=true
    yourResult = tester.search("pear coconut blueberry coconut papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear coconut blueberry coconut papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #509 checking search results for pear coconut blueberry coconut papaya with boost=true");
    // Test #510 checking search results for pear coconut blueberry coconut papaya with boost=false
    yourResult = tester.search("pear coconut blueberry coconut papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear coconut blueberry coconut papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #510 checking search results for pear coconut blueberry coconut papaya with boost=false");
    // Test #511 checking search results for orange orange kiwi lime papaya with boost=true
    yourResult = tester.search("orange orange kiwi lime papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange kiwi lime papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #511 checking search results for orange orange kiwi lime papaya with boost=true");
    // Test #512 checking search results for orange orange kiwi lime papaya with boost=false
    yourResult = tester.search("orange orange kiwi lime papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange kiwi lime papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #512 checking search results for orange orange kiwi lime papaya with boost=false");
    // Test #513 checking search results for coconut peach banana peach blueberry with boost=true
    yourResult = tester.search("coconut peach banana peach blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana peach blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #513 checking search results for coconut peach banana peach blueberry with boost=true");
    // Test #514 checking search results for coconut peach banana peach blueberry with boost=false
    yourResult = tester.search("coconut peach banana peach blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana peach blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #514 checking search results for coconut peach banana peach blueberry with boost=false");
    // Test #515 checking search results for blueberry apple banana coconut with boost=true
    yourResult = tester.search("blueberry apple banana coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple banana coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #515 checking search results for blueberry apple banana coconut with boost=true");
    // Test #516 checking search results for blueberry apple banana coconut with boost=false
    yourResult = tester.search("blueberry apple banana coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple banana coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #516 checking search results for blueberry apple banana coconut with boost=false");
    // Test #517 checking search results for coconut fig apple coconut cherry with boost=true
    yourResult = tester.search("coconut fig apple coconut cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig apple coconut cherry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #517 checking search results for coconut fig apple coconut cherry with boost=true");
    // Test #518 checking search results for coconut fig apple coconut cherry with boost=false
    yourResult = tester.search("coconut fig apple coconut cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig apple coconut cherry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #518 checking search results for coconut fig apple coconut cherry with boost=false");
    // Test #519 checking search results for lime blueberry orange apple apple with boost=true
    yourResult = tester.search("lime blueberry orange apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime blueberry orange apple apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #519 checking search results for lime blueberry orange apple apple with boost=true");
    // Test #520 checking search results for lime blueberry orange apple apple with boost=false
    yourResult = tester.search("lime blueberry orange apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime blueberry orange apple apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #520 checking search results for lime blueberry orange apple apple with boost=false");
    // Test #521 checking search results for coconut pear coconut orange apricot with boost=true
    yourResult = tester.search("coconut pear coconut orange apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut pear coconut orange apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #521 checking search results for coconut pear coconut orange apricot with boost=true");
    // Test #522 checking search results for coconut pear coconut orange apricot with boost=false
    yourResult = tester.search("coconut pear coconut orange apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut pear coconut orange apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #522 checking search results for coconut pear coconut orange apricot with boost=false");
    // Test #523 checking search results for blueberry coconut apple banana with boost=true
    yourResult = tester.search("blueberry coconut apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry coconut apple banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #523 checking search results for blueberry coconut apple banana with boost=true");
    // Test #524 checking search results for blueberry coconut apple banana with boost=false
    yourResult = tester.search("blueberry coconut apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry coconut apple banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #524 checking search results for blueberry coconut apple banana with boost=false");
    // Test #525 checking search results for apple papaya cherry apple fig with boost=true
    yourResult = tester.search("apple papaya cherry apple fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya cherry apple fig",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #525 checking search results for apple papaya cherry apple fig with boost=true");
    // Test #526 checking search results for apple papaya cherry apple fig with boost=false
    yourResult = tester.search("apple papaya cherry apple fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya cherry apple fig",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #526 checking search results for apple papaya cherry apple fig with boost=false");
    // Test #527 checking search results for cherry peach peach blueberry banana with boost=true
    yourResult = tester.search("cherry peach peach blueberry banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach peach blueberry banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #527 checking search results for cherry peach peach blueberry banana with boost=true");
    // Test #528 checking search results for cherry peach peach blueberry banana with boost=false
    yourResult = tester.search("cherry peach peach blueberry banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach peach blueberry banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #528 checking search results for cherry peach peach blueberry banana with boost=false");
    // Test #529 checking search results for blueberry coconut apple banana with boost=true
    yourResult = tester.search("blueberry coconut apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry coconut apple banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #529 checking search results for blueberry coconut apple banana with boost=true");
    // Test #530 checking search results for blueberry coconut apple banana with boost=false
    yourResult = tester.search("blueberry coconut apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry coconut apple banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #530 checking search results for blueberry coconut apple banana with boost=false");
    // Test #531 checking search results for kiwi coconut peach apple apple with boost=true
    yourResult = tester.search("kiwi coconut peach apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut peach apple apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #531 checking search results for kiwi coconut peach apple apple with boost=true");
    // Test #532 checking search results for kiwi coconut peach apple apple with boost=false
    yourResult = tester.search("kiwi coconut peach apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut peach apple apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #532 checking search results for kiwi coconut peach apple apple with boost=false");
    // Test #533 checking search results for peach peach coconut blueberry banana with boost=true
    yourResult = tester.search("peach peach coconut blueberry banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach coconut blueberry banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #533 checking search results for peach peach coconut blueberry banana with boost=true");
    // Test #534 checking search results for peach peach coconut blueberry banana with boost=false
    yourResult = tester.search("peach peach coconut blueberry banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach coconut blueberry banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #534 checking search results for peach peach coconut blueberry banana with boost=false");
    // Test #535 checking search results for banana fig banana banana papaya with boost=true
    yourResult = tester.search("banana fig banana banana papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana fig banana banana papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #535 checking search results for banana fig banana banana papaya with boost=true");
    // Test #536 checking search results for banana fig banana banana papaya with boost=false
    yourResult = tester.search("banana fig banana banana papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana fig banana banana papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #536 checking search results for banana fig banana banana papaya with boost=false");
    // Test #537 checking search results for coconut blueberry banana apple with boost=true
    yourResult = tester.search("coconut blueberry banana apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut blueberry banana apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #537 checking search results for coconut blueberry banana apple with boost=true");
    // Test #538 checking search results for coconut blueberry banana apple with boost=false
    yourResult = tester.search("coconut blueberry banana apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut blueberry banana apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #538 checking search results for coconut blueberry banana apple with boost=false");
    // Test #539 checking search results for cherry coconut coconut papaya fig with boost=true
    yourResult = tester.search("cherry coconut coconut papaya fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry coconut coconut papaya fig",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #539 checking search results for cherry coconut coconut papaya fig with boost=true");
    // Test #540 checking search results for cherry coconut coconut papaya fig with boost=false
    yourResult = tester.search("cherry coconut coconut papaya fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry coconut coconut papaya fig",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #540 checking search results for cherry coconut coconut papaya fig with boost=false");
    // Test #541 checking search results for coconut fig apple coconut cherry with boost=true
    yourResult = tester.search("coconut fig apple coconut cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig apple coconut cherry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #541 checking search results for coconut fig apple coconut cherry with boost=true");
    // Test #542 checking search results for coconut fig apple coconut cherry with boost=false
    yourResult = tester.search("coconut fig apple coconut cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig apple coconut cherry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #542 checking search results for coconut fig apple coconut cherry with boost=false");
    // Test #543 checking search results for apple apricot blueberry blueberry coconut with
    // boost=true
    yourResult = tester.search("apple apricot blueberry blueberry coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apricot blueberry blueberry coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #543 checking search results for apple apricot blueberry blueberry coconut with boost=true");
    // Test #544 checking search results for apple apricot blueberry blueberry coconut with
    // boost=false
    yourResult = tester.search("apple apricot blueberry blueberry coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apricot blueberry blueberry coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #544 checking search results for apple apricot blueberry blueberry coconut with boost=false");
    // Test #545 checking search results for peach peach orange banana blueberry with boost=true
    yourResult = tester.search("peach peach orange banana blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach orange banana blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #545 checking search results for peach peach orange banana blueberry with boost=true");
    // Test #546 checking search results for peach peach orange banana blueberry with boost=false
    yourResult = tester.search("peach peach orange banana blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach orange banana blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #546 checking search results for peach peach orange banana blueberry with boost=false");
    // Test #547 checking search results for kiwi coconut coconut pear with boost=true
    yourResult = tester.search("kiwi coconut coconut pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut coconut pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #547 checking search results for kiwi coconut coconut pear with boost=true");
    // Test #548 checking search results for kiwi coconut coconut pear with boost=false
    yourResult = tester.search("kiwi coconut coconut pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut coconut pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #548 checking search results for kiwi coconut coconut pear with boost=false");
    // Test #549 checking search results for coconut apple blueberry blueberry apricot with
    // boost=true
    yourResult = tester.search("coconut apple blueberry blueberry apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple blueberry blueberry apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #549 checking search results for coconut apple blueberry blueberry apricot with boost=true");
    // Test #550 checking search results for coconut apple blueberry blueberry apricot with
    // boost=false
    yourResult = tester.search("coconut apple blueberry blueberry apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple blueberry blueberry apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #550 checking search results for coconut apple blueberry blueberry apricot with boost=false");
    // Test #551 checking search results for cherry fig papaya coconut coconut with boost=true
    yourResult = tester.search("cherry fig papaya coconut coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry fig papaya coconut coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #551 checking search results for cherry fig papaya coconut coconut with boost=true");
    // Test #552 checking search results for cherry fig papaya coconut coconut with boost=false
    yourResult = tester.search("cherry fig papaya coconut coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry fig papaya coconut coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #552 checking search results for cherry fig papaya coconut coconut with boost=false");
    // Test #553 checking search results for kiwi coconut apple fig coconut with boost=true
    yourResult = tester.search("kiwi coconut apple fig coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut apple fig coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #553 checking search results for kiwi coconut apple fig coconut with boost=true");
    // Test #554 checking search results for kiwi coconut apple fig coconut with boost=false
    yourResult = tester.search("kiwi coconut apple fig coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut apple fig coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #554 checking search results for kiwi coconut apple fig coconut with boost=false");
    // Test #555 checking search results for apple coconut apple kiwi peach with boost=true
    yourResult = tester.search("apple coconut apple kiwi peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apple kiwi peach",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #555 checking search results for apple coconut apple kiwi peach with boost=true");
    // Test #556 checking search results for apple coconut apple kiwi peach with boost=false
    yourResult = tester.search("apple coconut apple kiwi peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut apple kiwi peach",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #556 checking search results for apple coconut apple kiwi peach with boost=false");
    // Test #557 checking search results for kiwi lime apple apple apple with boost=true
    yourResult = tester.search("kiwi lime apple apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi lime apple apple apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #557 checking search results for kiwi lime apple apple apple with boost=true");
    // Test #558 checking search results for kiwi lime apple apple apple with boost=false
    yourResult = tester.search("kiwi lime apple apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi lime apple apple apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #558 checking search results for kiwi lime apple apple apple with boost=false");
    // Test #559 checking search results for fig fig fig cherry peach with boost=true
    yourResult = tester.search("fig fig fig cherry peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig fig fig cherry peach",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #559 checking search results for fig fig fig cherry peach with boost=true");
    // Test #560 checking search results for fig fig fig cherry peach with boost=false
    yourResult = tester.search("fig fig fig cherry peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig fig fig cherry peach",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #560 checking search results for fig fig fig cherry peach with boost=false");
    // Test #561 checking search results for cherry fig papaya apple apple with boost=true
    yourResult = tester.search("cherry fig papaya apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry fig papaya apple apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #561 checking search results for cherry fig papaya apple apple with boost=true");
    // Test #562 checking search results for cherry fig papaya apple apple with boost=false
    yourResult = tester.search("cherry fig papaya apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry fig papaya apple apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #562 checking search results for cherry fig papaya apple apple with boost=false");
    // Test #563 checking search results for pear orange coconut apricot coconut with boost=true
    yourResult = tester.search("pear orange coconut apricot coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange coconut apricot coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #563 checking search results for pear orange coconut apricot coconut with boost=true");
    // Test #564 checking search results for pear orange coconut apricot coconut with boost=false
    yourResult = tester.search("pear orange coconut apricot coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear orange coconut apricot coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #564 checking search results for pear orange coconut apricot coconut with boost=false");
    // Test #565 checking search results for orange apple coconut fig coconut with boost=true
    yourResult = tester.search("orange apple coconut fig coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple coconut fig coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #565 checking search results for orange apple coconut fig coconut with boost=true");
    // Test #566 checking search results for orange apple coconut fig coconut with boost=false
    yourResult = tester.search("orange apple coconut fig coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple coconut fig coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #566 checking search results for orange apple coconut fig coconut with boost=false");
    // Test #567 checking search results for peach coconut apricot coconut apple with boost=true
    yourResult = tester.search("peach coconut apricot coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut apricot coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #567 checking search results for peach coconut apricot coconut apple with boost=true");
    // Test #568 checking search results for peach coconut apricot coconut apple with boost=false
    yourResult = tester.search("peach coconut apricot coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut apricot coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #568 checking search results for peach coconut apricot coconut apple with boost=false");
    // Test #569 checking search results for blueberry apricot blueberry banana blueberry with
    // boost=true
    yourResult = tester.search("blueberry apricot blueberry banana blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apricot blueberry banana blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #569 checking search results for blueberry apricot blueberry banana blueberry with boost=true");
    // Test #570 checking search results for blueberry apricot blueberry banana blueberry with
    // boost=false
    yourResult = tester.search("blueberry apricot blueberry banana blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apricot blueberry banana blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #570 checking search results for blueberry apricot blueberry banana blueberry with boost=false");
    // Test #571 checking search results for papaya kiwi orange lime orange with boost=true
    yourResult = tester.search("papaya kiwi orange lime orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya kiwi orange lime orange",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #571 checking search results for papaya kiwi orange lime orange with boost=true");
    // Test #572 checking search results for papaya kiwi orange lime orange with boost=false
    yourResult = tester.search("papaya kiwi orange lime orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya kiwi orange lime orange",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #572 checking search results for papaya kiwi orange lime orange with boost=false");
    // Test #573 checking search results for apricot coconut coconut orange pear with boost=true
    yourResult = tester.search("apricot coconut coconut orange pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot coconut coconut orange pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #573 checking search results for apricot coconut coconut orange pear with boost=true");
    // Test #574 checking search results for apricot coconut coconut orange pear with boost=false
    yourResult = tester.search("apricot coconut coconut orange pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot coconut coconut orange pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #574 checking search results for apricot coconut coconut orange pear with boost=false");
    // Test #575 checking search results for kiwi coconut fig coconut apple with boost=true
    yourResult = tester.search("kiwi coconut fig coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut fig coconut apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #575 checking search results for kiwi coconut fig coconut apple with boost=true");
    // Test #576 checking search results for kiwi coconut fig coconut apple with boost=false
    yourResult = tester.search("kiwi coconut fig coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi coconut fig coconut apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #576 checking search results for kiwi coconut fig coconut apple with boost=false");
    // Test #577 checking search results for fig orange coconut apple coconut with boost=true
    yourResult = tester.search("fig orange coconut apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig orange coconut apple coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #577 checking search results for fig orange coconut apple coconut with boost=true");
    // Test #578 checking search results for fig orange coconut apple coconut with boost=false
    yourResult = tester.search("fig orange coconut apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig orange coconut apple coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #578 checking search results for fig orange coconut apple coconut with boost=false");
    // Test #579 checking search results for coconut kiwi coconut pear with boost=true
    yourResult = tester.search("coconut kiwi coconut pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi coconut pear",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #579 checking search results for coconut kiwi coconut pear with boost=true");
    // Test #580 checking search results for coconut kiwi coconut pear with boost=false
    yourResult = tester.search("coconut kiwi coconut pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut kiwi coconut pear",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #580 checking search results for coconut kiwi coconut pear with boost=false");
    // Test #581 checking search results for banana blueberry apple coconut with boost=true
    yourResult = tester.search("banana blueberry apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana blueberry apple coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #581 checking search results for banana blueberry apple coconut with boost=true");
    // Test #582 checking search results for banana blueberry apple coconut with boost=false
    yourResult = tester.search("banana blueberry apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana blueberry apple coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #582 checking search results for banana blueberry apple coconut with boost=false");
    // Test #583 checking search results for cherry apple fig coconut coconut with boost=true
    yourResult = tester.search("cherry apple fig coconut coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apple fig coconut coconut",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #583 checking search results for cherry apple fig coconut coconut with boost=true");
    // Test #584 checking search results for cherry apple fig coconut coconut with boost=false
    yourResult = tester.search("cherry apple fig coconut coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry apple fig coconut coconut",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #584 checking search results for cherry apple fig coconut coconut with boost=false");
    // Test #585 checking search results for coconut coconut banana peach orange with boost=true
    yourResult = tester.search("coconut coconut banana peach orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut banana peach orange",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #585 checking search results for coconut coconut banana peach orange with boost=true");
    // Test #586 checking search results for coconut coconut banana peach orange with boost=false
    yourResult = tester.search("coconut coconut banana peach orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut banana peach orange",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #586 checking search results for coconut coconut banana peach orange with boost=false");
    // Test #587 checking search results for coconut coconut pear blueberry papaya with boost=true
    yourResult = tester.search("coconut coconut pear blueberry papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut pear blueberry papaya",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #587 checking search results for coconut coconut pear blueberry papaya with boost=true");
    // Test #588 checking search results for coconut coconut pear blueberry papaya with boost=false
    yourResult = tester.search("coconut coconut pear blueberry papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut coconut pear blueberry papaya",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #588 checking search results for coconut coconut pear blueberry papaya with boost=false");
    // Test #589 checking search results for blueberry coconut apple banana with boost=true
    yourResult = tester.search("blueberry coconut apple banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry coconut apple banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #589 checking search results for blueberry coconut apple banana with boost=true");
    // Test #590 checking search results for blueberry coconut apple banana with boost=false
    yourResult = tester.search("blueberry coconut apple banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry coconut apple banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #590 checking search results for blueberry coconut apple banana with boost=false");
    // Test #591 checking search results for cherry peach peach peach banana with boost=true
    yourResult = tester.search("cherry peach peach peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach peach peach banana",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #591 checking search results for cherry peach peach peach banana with boost=true");
    // Test #592 checking search results for cherry peach peach peach banana with boost=false
    yourResult = tester.search("cherry peach peach peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach peach peach banana",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #592 checking search results for cherry peach peach peach banana with boost=false");
    // Test #593 checking search results for apple blueberry lime apple orange with boost=true
    yourResult = tester.search("apple blueberry lime apple orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple blueberry lime apple orange",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #593 checking search results for apple blueberry lime apple orange with boost=true");
    // Test #594 checking search results for apple blueberry lime apple orange with boost=false
    yourResult = tester.search("apple blueberry lime apple orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple blueberry lime apple orange",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #594 checking search results for apple blueberry lime apple orange with boost=false");
    // Test #595 checking search results for apple fig apple papaya cherry with boost=true
    yourResult = tester.search("apple fig apple papaya cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig apple papaya cherry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #595 checking search results for apple fig apple papaya cherry with boost=true");
    // Test #596 checking search results for apple fig apple papaya cherry with boost=false
    yourResult = tester.search("apple fig apple papaya cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig apple papaya cherry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #596 checking search results for apple fig apple papaya cherry with boost=false");
    // Test #597 checking search results for apricot blueberry apple coconut blueberry with
    // boost=true
    yourResult = tester.search("apricot blueberry apple coconut blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot blueberry apple coconut blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #597 checking search results for apricot blueberry apple coconut blueberry with boost=true");
    // Test #598 checking search results for apricot blueberry apple coconut blueberry with
    // boost=false
    yourResult = tester.search("apricot blueberry apple coconut blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot blueberry apple coconut blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #598 checking search results for apricot blueberry apple coconut blueberry with boost=false");
    // Test #599 checking search results for apple blueberry orange lime apple with boost=true
    yourResult = tester.search("apple blueberry orange lime apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple blueberry orange lime apple",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #599 checking search results for apple blueberry orange lime apple with boost=true");
    // Test #600 checking search results for apple blueberry orange lime apple with boost=false
    yourResult = tester.search("apple blueberry orange lime apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple blueberry orange lime apple",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #600 checking search results for apple blueberry orange lime apple with boost=false");
    // Test #601 checking search results for banana coconut blueberry blueberry blueberry with
    // boost=true
    yourResult = tester.search("banana coconut blueberry blueberry blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana coconut blueberry blueberry blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #601 checking search results for banana coconut blueberry blueberry blueberry with boost=true");
    // Test #602 checking search results for banana coconut blueberry blueberry blueberry with
    // boost=false
    yourResult = tester.search("banana coconut blueberry blueberry blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana coconut blueberry blueberry blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #602 checking search results for banana coconut blueberry blueberry blueberry with boost=false");
    // Test #603 checking search results for blueberry blueberry cherry coconut blueberry with
    // boost=true
    yourResult = tester.search("blueberry blueberry cherry coconut blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry blueberry cherry coconut blueberry",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #603 checking search results for blueberry blueberry cherry coconut blueberry with boost=true");
    // Test #604 checking search results for blueberry blueberry cherry coconut blueberry with
    // boost=false
    yourResult = tester.search("blueberry blueberry cherry coconut blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry blueberry cherry coconut blueberry",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #604 checking search results for blueberry blueberry cherry coconut blueberry with boost=false");
    // Test #605 checking search results for apple apple banana cherry peach with boost=true
    yourResult = tester.search("apple apple banana cherry peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple banana cherry peach",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #605 checking search results for apple apple banana cherry peach with boost=true");
    // Test #606 checking search results for apple apple banana cherry peach with boost=false
    yourResult = tester.search("apple apple banana cherry peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple banana cherry peach",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #606 checking search results for apple apple banana cherry peach with boost=false");
    // Test #607 checking search results for papaya banana apricot blueberry apricot with boost=true
    yourResult = tester.search("papaya banana apricot blueberry apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya banana apricot blueberry apricot",
        true,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #607 checking search results for papaya banana apricot blueberry apricot with boost=true");
    // Test #608 checking search results for papaya banana apricot blueberry apricot with
    // boost=false
    yourResult = tester.search("papaya banana apricot blueberry apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya banana apricot blueberry apricot",
        false,
        passOut,
        failOut,
        "Fruits5SearchTester",
        "Test #608 checking search results for papaya banana apricot blueberry apricot with boost=false");
    failOut.close();
    passOut.close();
  }
}
