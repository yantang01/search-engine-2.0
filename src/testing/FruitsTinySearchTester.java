package testing;

import model.ProjectTester;
import model.ProjectTesterImp;
import model.SearchResult;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class FruitsTinySearchTester {
  public static void main(String[] args) throws Exception {
    ProjectTester tester =
        new ProjectTesterImp(); // Instantiate your own ProjectTester instance here
    tester.initialize();
    tester.crawl("https://people.scs.carleton.ca/~davidmckenney/tinyfruits/N-0.html");
    runTest(tester);
  }

  public static void runTest(ProjectTester tester) throws Exception {
    PrintWriter failOut = new PrintWriter(new FileWriter("FruitsTiny-Search-failed.txt"));
    PrintWriter passOut = new PrintWriter(new FileWriter("FruitsTiny-Search-passed.txt"));
    List<SearchResult> yourResult;
    // Test #289 checking search results for peach papaya with boost=true
    yourResult = tester.search("peach papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #289 checking search results for peach papaya with boost=true");
    // Test #290 checking search results for peach papaya with boost=false
    yourResult = tester.search("peach papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #290 checking search results for peach papaya with boost=false");
    // Test #291 checking search results for orange apricot coconut kiwi papaya with boost=true
    yourResult = tester.search("orange apricot coconut kiwi papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot coconut kiwi papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #291 checking search results for orange apricot coconut kiwi papaya with boost=true");
    // Test #292 checking search results for orange apricot coconut kiwi papaya with boost=false
    yourResult = tester.search("orange apricot coconut kiwi papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apricot coconut kiwi papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #292 checking search results for orange apricot coconut kiwi papaya with boost=false");
    // Test #293 checking search results for apricot peach apple with boost=true
    yourResult = tester.search("apricot peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #293 checking search results for apricot peach apple with boost=true");
    // Test #294 checking search results for apricot peach apple with boost=false
    yourResult = tester.search("apricot peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #294 checking search results for apricot peach apple with boost=false");
    // Test #295 checking search results for peach cherry apricot fig with boost=true
    yourResult = tester.search("peach cherry apricot fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach cherry apricot fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #295 checking search results for peach cherry apricot fig with boost=true");
    // Test #296 checking search results for peach cherry apricot fig with boost=false
    yourResult = tester.search("peach cherry apricot fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach cherry apricot fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #296 checking search results for peach cherry apricot fig with boost=false");
    // Test #297 checking search results for papaya coconut apple lime lime with boost=true
    yourResult = tester.search("papaya coconut apple lime lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya coconut apple lime lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #297 checking search results for papaya coconut apple lime lime with boost=true");
    // Test #298 checking search results for papaya coconut apple lime lime with boost=false
    yourResult = tester.search("papaya coconut apple lime lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya coconut apple lime lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #298 checking search results for papaya coconut apple lime lime with boost=false");
    // Test #299 checking search results for coconut papaya coconut pear lime with boost=true
    yourResult = tester.search("coconut papaya coconut pear lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya coconut pear lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #299 checking search results for coconut papaya coconut pear lime with boost=true");
    // Test #300 checking search results for coconut papaya coconut pear lime with boost=false
    yourResult = tester.search("coconut papaya coconut pear lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut papaya coconut pear lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #300 checking search results for coconut papaya coconut pear lime with boost=false");
    // Test #301 checking search results for coconut peach apple tomato orange with boost=true
    yourResult = tester.search("coconut peach apple tomato orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach apple tomato orange",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #301 checking search results for coconut peach apple tomato orange with boost=true");
    // Test #302 checking search results for coconut peach apple tomato orange with boost=false
    yourResult = tester.search("coconut peach apple tomato orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach apple tomato orange",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #302 checking search results for coconut peach apple tomato orange with boost=false");
    // Test #303 checking search results for apple cherry kiwi fig with boost=true
    yourResult = tester.search("apple cherry kiwi fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple cherry kiwi fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #303 checking search results for apple cherry kiwi fig with boost=true");
    // Test #304 checking search results for apple cherry kiwi fig with boost=false
    yourResult = tester.search("apple cherry kiwi fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple cherry kiwi fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #304 checking search results for apple cherry kiwi fig with boost=false");
    // Test #305 checking search results for peach coconut apple apple papaya with boost=true
    yourResult = tester.search("peach coconut apple apple papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut apple apple papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #305 checking search results for peach coconut apple apple papaya with boost=true");
    // Test #306 checking search results for peach coconut apple apple papaya with boost=false
    yourResult = tester.search("peach coconut apple apple papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut apple apple papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #306 checking search results for peach coconut apple apple papaya with boost=false");
    // Test #307 checking search results for pear papaya peach papaya with boost=true
    yourResult = tester.search("pear papaya peach papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear papaya peach papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #307 checking search results for pear papaya peach papaya with boost=true");
    // Test #308 checking search results for pear papaya peach papaya with boost=false
    yourResult = tester.search("pear papaya peach papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear papaya peach papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #308 checking search results for pear papaya peach papaya with boost=false");
    // Test #309 checking search results for blueberry lime coconut cherry with boost=true
    yourResult = tester.search("blueberry lime coconut cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry lime coconut cherry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #309 checking search results for blueberry lime coconut cherry with boost=true");
    // Test #310 checking search results for blueberry lime coconut cherry with boost=false
    yourResult = tester.search("blueberry lime coconut cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry lime coconut cherry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #310 checking search results for blueberry lime coconut cherry with boost=false");
    // Test #311 checking search results for orange peach papaya tomato with boost=true
    yourResult = tester.search("orange peach papaya tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach papaya tomato",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #311 checking search results for orange peach papaya tomato with boost=true");
    // Test #312 checking search results for orange peach papaya tomato with boost=false
    yourResult = tester.search("orange peach papaya tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange peach papaya tomato",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #312 checking search results for orange peach papaya tomato with boost=false");
    // Test #313 checking search results for coconut peach banana with boost=true
    yourResult = tester.search("coconut peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #313 checking search results for coconut peach banana with boost=true");
    // Test #314 checking search results for coconut peach banana with boost=false
    yourResult = tester.search("coconut peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach banana",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #314 checking search results for coconut peach banana with boost=false");
    // Test #315 checking search results for peach orange apple with boost=true
    yourResult = tester.search("peach orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #315 checking search results for peach orange apple with boost=true");
    // Test #316 checking search results for peach orange apple with boost=false
    yourResult = tester.search("peach orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #316 checking search results for peach orange apple with boost=false");
    // Test #317 checking search results for papaya fig with boost=true
    yourResult = tester.search("papaya fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #317 checking search results for papaya fig with boost=true");
    // Test #318 checking search results for papaya fig with boost=false
    yourResult = tester.search("papaya fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #318 checking search results for papaya fig with boost=false");
    // Test #319 checking search results for banana papaya banana papaya orange with boost=true
    yourResult = tester.search("banana papaya banana papaya orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana papaya banana papaya orange",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #319 checking search results for banana papaya banana papaya orange with boost=true");
    // Test #320 checking search results for banana papaya banana papaya orange with boost=false
    yourResult = tester.search("banana papaya banana papaya orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana papaya banana papaya orange",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #320 checking search results for banana papaya banana papaya orange with boost=false");
    // Test #321 checking search results for pear kiwi tomato orange papaya with boost=true
    yourResult = tester.search("pear kiwi tomato orange papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear kiwi tomato orange papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #321 checking search results for pear kiwi tomato orange papaya with boost=true");
    // Test #322 checking search results for pear kiwi tomato orange papaya with boost=false
    yourResult = tester.search("pear kiwi tomato orange papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear kiwi tomato orange papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #322 checking search results for pear kiwi tomato orange papaya with boost=false");
    // Test #323 checking search results for lime cherry with boost=true
    yourResult = tester.search("lime cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime cherry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #323 checking search results for lime cherry with boost=true");
    // Test #324 checking search results for lime cherry with boost=false
    yourResult = tester.search("lime cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime cherry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #324 checking search results for lime cherry with boost=false");
    // Test #325 checking search results for lime coconut peach cherry kiwi with boost=true
    yourResult = tester.search("lime coconut peach cherry kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime coconut peach cherry kiwi",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #325 checking search results for lime coconut peach cherry kiwi with boost=true");
    // Test #326 checking search results for lime coconut peach cherry kiwi with boost=false
    yourResult = tester.search("lime coconut peach cherry kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime coconut peach cherry kiwi",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #326 checking search results for lime coconut peach cherry kiwi with boost=false");
    // Test #327 checking search results for orange apple with boost=true
    yourResult = tester.search("orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #327 checking search results for orange apple with boost=true");
    // Test #328 checking search results for orange apple with boost=false
    yourResult = tester.search("orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #328 checking search results for orange apple with boost=false");
    // Test #329 checking search results for kiwi papaya lime pear apricot with boost=true
    yourResult = tester.search("kiwi papaya lime pear apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya lime pear apricot",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #329 checking search results for kiwi papaya lime pear apricot with boost=true");
    // Test #330 checking search results for kiwi papaya lime pear apricot with boost=false
    yourResult = tester.search("kiwi papaya lime pear apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi papaya lime pear apricot",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #330 checking search results for kiwi papaya lime pear apricot with boost=false");
    // Test #331 checking search results for coconut apricot pear papaya with boost=true
    yourResult = tester.search("coconut apricot pear papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apricot pear papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #331 checking search results for coconut apricot pear papaya with boost=true");
    // Test #332 checking search results for coconut apricot pear papaya with boost=false
    yourResult = tester.search("coconut apricot pear papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apricot pear papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #332 checking search results for coconut apricot pear papaya with boost=false");
    // Test #333 checking search results for peach apple apple pear apricot with boost=true
    yourResult = tester.search("peach apple apple pear apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple pear apricot",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #333 checking search results for peach apple apple pear apricot with boost=true");
    // Test #334 checking search results for peach apple apple pear apricot with boost=false
    yourResult = tester.search("peach apple apple pear apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple apple pear apricot",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #334 checking search results for peach apple apple pear apricot with boost=false");
    // Test #335 checking search results for orange lime with boost=true
    yourResult = tester.search("orange lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #335 checking search results for orange lime with boost=true");
    // Test #336 checking search results for orange lime with boost=false
    yourResult = tester.search("orange lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #336 checking search results for orange lime with boost=false");
    // Test #337 checking search results for tomato cherry fig papaya with boost=true
    yourResult = tester.search("tomato cherry fig papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry fig papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #337 checking search results for tomato cherry fig papaya with boost=true");
    // Test #338 checking search results for tomato cherry fig papaya with boost=false
    yourResult = tester.search("tomato cherry fig papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry fig papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #338 checking search results for tomato cherry fig papaya with boost=false");
    // Test #339 checking search results for cherry blueberry lime with boost=true
    yourResult = tester.search("cherry blueberry lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry blueberry lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #339 checking search results for cherry blueberry lime with boost=true");
    // Test #340 checking search results for cherry blueberry lime with boost=false
    yourResult = tester.search("cherry blueberry lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry blueberry lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #340 checking search results for cherry blueberry lime with boost=false");
    // Test #341 checking search results for coconut fig lime apricot with boost=true
    yourResult = tester.search("coconut fig lime apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig lime apricot",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #341 checking search results for coconut fig lime apricot with boost=true");
    // Test #342 checking search results for coconut fig lime apricot with boost=false
    yourResult = tester.search("coconut fig lime apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig lime apricot",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #342 checking search results for coconut fig lime apricot with boost=false");
    // Test #343 checking search results for orange pear banana peach banana with boost=true
    yourResult = tester.search("orange pear banana peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange pear banana peach banana",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #343 checking search results for orange pear banana peach banana with boost=true");
    // Test #344 checking search results for orange pear banana peach banana with boost=false
    yourResult = tester.search("orange pear banana peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange pear banana peach banana",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #344 checking search results for orange pear banana peach banana with boost=false");
    // Test #345 checking search results for tomato orange banana papaya lime with boost=true
    yourResult = tester.search("tomato orange banana papaya lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato orange banana papaya lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #345 checking search results for tomato orange banana papaya lime with boost=true");
    // Test #346 checking search results for tomato orange banana papaya lime with boost=false
    yourResult = tester.search("tomato orange banana papaya lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato orange banana papaya lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #346 checking search results for tomato orange banana papaya lime with boost=false");
    // Test #347 checking search results for apricot peach coconut with boost=true
    yourResult = tester.search("apricot peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach coconut",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #347 checking search results for apricot peach coconut with boost=true");
    // Test #348 checking search results for apricot peach coconut with boost=false
    yourResult = tester.search("apricot peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach coconut",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #348 checking search results for apricot peach coconut with boost=false");
    // Test #349 checking search results for apricot papaya apple peach with boost=true
    yourResult = tester.search("apricot papaya apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot papaya apple peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #349 checking search results for apricot papaya apple peach with boost=true");
    // Test #350 checking search results for apricot papaya apple peach with boost=false
    yourResult = tester.search("apricot papaya apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot papaya apple peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #350 checking search results for apricot papaya apple peach with boost=false");
    // Test #351 checking search results for coconut fig papaya peach banana with boost=true
    yourResult = tester.search("coconut fig papaya peach banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig papaya peach banana",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #351 checking search results for coconut fig papaya peach banana with boost=true");
    // Test #352 checking search results for coconut fig papaya peach banana with boost=false
    yourResult = tester.search("coconut fig papaya peach banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig papaya peach banana",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #352 checking search results for coconut fig papaya peach banana with boost=false");
    // Test #353 checking search results for apple fig with boost=true
    yourResult = tester.search("apple fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #353 checking search results for apple fig with boost=true");
    // Test #354 checking search results for apple fig with boost=false
    yourResult = tester.search("apple fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #354 checking search results for apple fig with boost=false");
    // Test #355 checking search results for pear peach coconut apple with boost=true
    yourResult = tester.search("pear peach coconut apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear peach coconut apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #355 checking search results for pear peach coconut apple with boost=true");
    // Test #356 checking search results for pear peach coconut apple with boost=false
    yourResult = tester.search("pear peach coconut apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear peach coconut apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #356 checking search results for pear peach coconut apple with boost=false");
    // Test #357 checking search results for banana orange papaya banana with boost=true
    yourResult = tester.search("banana orange papaya banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana orange papaya banana",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #357 checking search results for banana orange papaya banana with boost=true");
    // Test #358 checking search results for banana orange papaya banana with boost=false
    yourResult = tester.search("banana orange papaya banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana orange papaya banana",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #358 checking search results for banana orange papaya banana with boost=false");
    // Test #359 checking search results for lime cherry banana tomato with boost=true
    yourResult = tester.search("lime cherry banana tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime cherry banana tomato",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #359 checking search results for lime cherry banana tomato with boost=true");
    // Test #360 checking search results for lime cherry banana tomato with boost=false
    yourResult = tester.search("lime cherry banana tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime cherry banana tomato",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #360 checking search results for lime cherry banana tomato with boost=false");
    // Test #361 checking search results for apricot peach apple lime fig with boost=true
    yourResult = tester.search("apricot peach apple lime fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach apple lime fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #361 checking search results for apricot peach apple lime fig with boost=true");
    // Test #362 checking search results for apricot peach apple lime fig with boost=false
    yourResult = tester.search("apricot peach apple lime fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach apple lime fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #362 checking search results for apricot peach apple lime fig with boost=false");
    // Test #363 checking search results for apple lime peach papaya with boost=true
    yourResult = tester.search("apple lime peach papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple lime peach papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #363 checking search results for apple lime peach papaya with boost=true");
    // Test #364 checking search results for apple lime peach papaya with boost=false
    yourResult = tester.search("apple lime peach papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple lime peach papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #364 checking search results for apple lime peach papaya with boost=false");
    // Test #365 checking search results for pear fig orange lime with boost=true
    yourResult = tester.search("pear fig orange lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear fig orange lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #365 checking search results for pear fig orange lime with boost=true");
    // Test #366 checking search results for pear fig orange lime with boost=false
    yourResult = tester.search("pear fig orange lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear fig orange lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #366 checking search results for pear fig orange lime with boost=false");
    // Test #367 checking search results for banana lime coconut fig peach with boost=true
    yourResult = tester.search("banana lime coconut fig peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana lime coconut fig peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #367 checking search results for banana lime coconut fig peach with boost=true");
    // Test #368 checking search results for banana lime coconut fig peach with boost=false
    yourResult = tester.search("banana lime coconut fig peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana lime coconut fig peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #368 checking search results for banana lime coconut fig peach with boost=false");
    // Test #369 checking search results for kiwi banana lime papaya cherry with boost=true
    yourResult = tester.search("kiwi banana lime papaya cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi banana lime papaya cherry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #369 checking search results for kiwi banana lime papaya cherry with boost=true");
    // Test #370 checking search results for kiwi banana lime papaya cherry with boost=false
    yourResult = tester.search("kiwi banana lime papaya cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi banana lime papaya cherry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #370 checking search results for kiwi banana lime papaya cherry with boost=false");
    // Test #371 checking search results for apple coconut papaya apricot coconut with boost=true
    yourResult = tester.search("apple coconut papaya apricot coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut papaya apricot coconut",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #371 checking search results for apple coconut papaya apricot coconut with boost=true");
    // Test #372 checking search results for apple coconut papaya apricot coconut with boost=false
    yourResult = tester.search("apple coconut papaya apricot coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple coconut papaya apricot coconut",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #372 checking search results for apple coconut papaya apricot coconut with boost=false");
    // Test #373 checking search results for apple papaya lime with boost=true
    yourResult = tester.search("apple papaya lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #373 checking search results for apple papaya lime with boost=true");
    // Test #374 checking search results for apple papaya lime with boost=false
    yourResult = tester.search("apple papaya lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #374 checking search results for apple papaya lime with boost=false");
    // Test #375 checking search results for peach orange with boost=true
    yourResult = tester.search("peach orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #375 checking search results for peach orange with boost=true");
    // Test #376 checking search results for peach orange with boost=false
    yourResult = tester.search("peach orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #376 checking search results for peach orange with boost=false");
    // Test #377 checking search results for coconut orange papaya peach with boost=true
    yourResult = tester.search("coconut orange papaya peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange papaya peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #377 checking search results for coconut orange papaya peach with boost=true");
    // Test #378 checking search results for coconut orange papaya peach with boost=false
    yourResult = tester.search("coconut orange papaya peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange papaya peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #378 checking search results for coconut orange papaya peach with boost=false");
    // Test #379 checking search results for cherry blueberry kiwi with boost=true
    yourResult = tester.search("cherry blueberry kiwi", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry blueberry kiwi",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #379 checking search results for cherry blueberry kiwi with boost=true");
    // Test #380 checking search results for cherry blueberry kiwi with boost=false
    yourResult = tester.search("cherry blueberry kiwi", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry blueberry kiwi",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #380 checking search results for cherry blueberry kiwi with boost=false");
    // Test #381 checking search results for coconut orange papaya pear pear with boost=true
    yourResult = tester.search("coconut orange papaya pear pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange papaya pear pear",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #381 checking search results for coconut orange papaya pear pear with boost=true");
    // Test #382 checking search results for coconut orange papaya pear pear with boost=false
    yourResult = tester.search("coconut orange papaya pear pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut orange papaya pear pear",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #382 checking search results for coconut orange papaya pear pear with boost=false");
    // Test #383 checking search results for peach apple with boost=true
    yourResult = tester.search("peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #383 checking search results for peach apple with boost=true");
    // Test #384 checking search results for peach apple with boost=false
    yourResult = tester.search("peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #384 checking search results for peach apple with boost=false");
    // Test #385 checking search results for pear peach apricot cherry pear with boost=true
    yourResult = tester.search("pear peach apricot cherry pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear peach apricot cherry pear",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #385 checking search results for pear peach apricot cherry pear with boost=true");
    // Test #386 checking search results for pear peach apricot cherry pear with boost=false
    yourResult = tester.search("pear peach apricot cherry pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear peach apricot cherry pear",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #386 checking search results for pear peach apricot cherry pear with boost=false");
    // Test #387 checking search results for pear lime orange banana with boost=true
    yourResult = tester.search("pear lime orange banana", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime orange banana",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #387 checking search results for pear lime orange banana with boost=true");
    // Test #388 checking search results for pear lime orange banana with boost=false
    yourResult = tester.search("pear lime orange banana", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime orange banana",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #388 checking search results for pear lime orange banana with boost=false");
    // Test #389 checking search results for coconut fig lime apple with boost=true
    yourResult = tester.search("coconut fig lime apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig lime apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #389 checking search results for coconut fig lime apple with boost=true");
    // Test #390 checking search results for coconut fig lime apple with boost=false
    yourResult = tester.search("coconut fig lime apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut fig lime apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #390 checking search results for coconut fig lime apple with boost=false");
    // Test #391 checking search results for banana cherry peach apricot tomato with boost=true
    yourResult = tester.search("banana cherry peach apricot tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana cherry peach apricot tomato",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #391 checking search results for banana cherry peach apricot tomato with boost=true");
    // Test #392 checking search results for banana cherry peach apricot tomato with boost=false
    yourResult = tester.search("banana cherry peach apricot tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "banana cherry peach apricot tomato",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #392 checking search results for banana cherry peach apricot tomato with boost=false");
    // Test #393 checking search results for apple papaya orange apple with boost=true
    yourResult = tester.search("apple papaya orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya orange apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #393 checking search results for apple papaya orange apple with boost=true");
    // Test #394 checking search results for apple papaya orange apple with boost=false
    yourResult = tester.search("apple papaya orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple papaya orange apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #394 checking search results for apple papaya orange apple with boost=false");
    // Test #395 checking search results for papaya lime with boost=true
    yourResult = tester.search("papaya lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #395 checking search results for papaya lime with boost=true");
    // Test #396 checking search results for papaya lime with boost=false
    yourResult = tester.search("papaya lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #396 checking search results for papaya lime with boost=false");
    // Test #397 checking search results for kiwi peach orange apple apple with boost=true
    yourResult = tester.search("kiwi peach orange apple apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi peach orange apple apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #397 checking search results for kiwi peach orange apple apple with boost=true");
    // Test #398 checking search results for kiwi peach orange apple apple with boost=false
    yourResult = tester.search("kiwi peach orange apple apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi peach orange apple apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #398 checking search results for kiwi peach orange apple apple with boost=false");
    // Test #399 checking search results for fig papaya with boost=true
    yourResult = tester.search("fig papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #399 checking search results for fig papaya with boost=true");
    // Test #400 checking search results for fig papaya with boost=false
    yourResult = tester.search("fig papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #400 checking search results for fig papaya with boost=false");
    // Test #401 checking search results for pear papaya apple cherry apple with boost=true
    yourResult = tester.search("pear papaya apple cherry apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear papaya apple cherry apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #401 checking search results for pear papaya apple cherry apple with boost=true");
    // Test #402 checking search results for pear papaya apple cherry apple with boost=false
    yourResult = tester.search("pear papaya apple cherry apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear papaya apple cherry apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #402 checking search results for pear papaya apple cherry apple with boost=false");
    // Test #403 checking search results for pear cherry lime with boost=true
    yourResult = tester.search("pear cherry lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear cherry lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #403 checking search results for pear cherry lime with boost=true");
    // Test #404 checking search results for pear cherry lime with boost=false
    yourResult = tester.search("pear cherry lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear cherry lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #404 checking search results for pear cherry lime with boost=false");
    // Test #405 checking search results for papaya apple lime pear with boost=true
    yourResult = tester.search("papaya apple lime pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya apple lime pear",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #405 checking search results for papaya apple lime pear with boost=true");
    // Test #406 checking search results for papaya apple lime pear with boost=false
    yourResult = tester.search("papaya apple lime pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya apple lime pear",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #406 checking search results for papaya apple lime pear with boost=false");
    // Test #407 checking search results for apricot papaya blueberry papaya peach with boost=true
    yourResult = tester.search("apricot papaya blueberry papaya peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot papaya blueberry papaya peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #407 checking search results for apricot papaya blueberry papaya peach with boost=true");
    // Test #408 checking search results for apricot papaya blueberry papaya peach with boost=false
    yourResult = tester.search("apricot papaya blueberry papaya peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot papaya blueberry papaya peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #408 checking search results for apricot papaya blueberry papaya peach with boost=false");
    // Test #409 checking search results for orange orange papaya apple with boost=true
    yourResult = tester.search("orange orange papaya apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange papaya apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #409 checking search results for orange orange papaya apple with boost=true");
    // Test #410 checking search results for orange orange papaya apple with boost=false
    yourResult = tester.search("orange orange papaya apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange orange papaya apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #410 checking search results for orange orange papaya apple with boost=false");
    // Test #411 checking search results for papaya tomato papaya tomato fig with boost=true
    yourResult = tester.search("papaya tomato papaya tomato fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya tomato papaya tomato fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #411 checking search results for papaya tomato papaya tomato fig with boost=true");
    // Test #412 checking search results for papaya tomato papaya tomato fig with boost=false
    yourResult = tester.search("papaya tomato papaya tomato fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya tomato papaya tomato fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #412 checking search results for papaya tomato papaya tomato fig with boost=false");
    // Test #413 checking search results for tomato cherry kiwi lime with boost=true
    yourResult = tester.search("tomato cherry kiwi lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry kiwi lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #413 checking search results for tomato cherry kiwi lime with boost=true");
    // Test #414 checking search results for tomato cherry kiwi lime with boost=false
    yourResult = tester.search("tomato cherry kiwi lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry kiwi lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #414 checking search results for tomato cherry kiwi lime with boost=false");
    // Test #415 checking search results for apple blueberry orange with boost=true
    yourResult = tester.search("apple blueberry orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple blueberry orange",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #415 checking search results for apple blueberry orange with boost=true");
    // Test #416 checking search results for apple blueberry orange with boost=false
    yourResult = tester.search("apple blueberry orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple blueberry orange",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #416 checking search results for apple blueberry orange with boost=false");
    // Test #417 checking search results for cherry peach papaya with boost=true
    yourResult = tester.search("cherry peach papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #417 checking search results for cherry peach papaya with boost=true");
    // Test #418 checking search results for cherry peach papaya with boost=false
    yourResult = tester.search("cherry peach papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #418 checking search results for cherry peach papaya with boost=false");
    // Test #419 checking search results for peach banana orange fig lime with boost=true
    yourResult = tester.search("peach banana orange fig lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana orange fig lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #419 checking search results for peach banana orange fig lime with boost=true");
    // Test #420 checking search results for peach banana orange fig lime with boost=false
    yourResult = tester.search("peach banana orange fig lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach banana orange fig lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #420 checking search results for peach banana orange fig lime with boost=false");
    // Test #421 checking search results for orange papaya orange blueberry with boost=true
    yourResult = tester.search("orange papaya orange blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya orange blueberry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #421 checking search results for orange papaya orange blueberry with boost=true");
    // Test #422 checking search results for orange papaya orange blueberry with boost=false
    yourResult = tester.search("orange papaya orange blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange papaya orange blueberry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #422 checking search results for orange papaya orange blueberry with boost=false");
    // Test #423 checking search results for apple apple coconut with boost=true
    yourResult = tester.search("apple apple coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple coconut",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #423 checking search results for apple apple coconut with boost=true");
    // Test #424 checking search results for apple apple coconut with boost=false
    yourResult = tester.search("apple apple coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple apple coconut",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #424 checking search results for apple apple coconut with boost=false");
    // Test #425 checking search results for orange lime pear apricot with boost=true
    yourResult = tester.search("orange lime pear apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime pear apricot",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #425 checking search results for orange lime pear apricot with boost=true");
    // Test #426 checking search results for orange lime pear apricot with boost=false
    yourResult = tester.search("orange lime pear apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime pear apricot",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #426 checking search results for orange lime pear apricot with boost=false");
    // Test #427 checking search results for peach papaya with boost=true
    yourResult = tester.search("peach papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #427 checking search results for peach papaya with boost=true");
    // Test #428 checking search results for peach papaya with boost=false
    yourResult = tester.search("peach papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #428 checking search results for peach papaya with boost=false");
    // Test #429 checking search results for lime papaya coconut with boost=true
    yourResult = tester.search("lime papaya coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya coconut",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #429 checking search results for lime papaya coconut with boost=true");
    // Test #430 checking search results for lime papaya coconut with boost=false
    yourResult = tester.search("lime papaya coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime papaya coconut",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #430 checking search results for lime papaya coconut with boost=false");
    // Test #431 checking search results for lime peach coconut with boost=true
    yourResult = tester.search("lime peach coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime peach coconut",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #431 checking search results for lime peach coconut with boost=true");
    // Test #432 checking search results for lime peach coconut with boost=false
    yourResult = tester.search("lime peach coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime peach coconut",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #432 checking search results for lime peach coconut with boost=false");
    // Test #433 checking search results for fig tomato apple pear tomato with boost=true
    yourResult = tester.search("fig tomato apple pear tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig tomato apple pear tomato",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #433 checking search results for fig tomato apple pear tomato with boost=true");
    // Test #434 checking search results for fig tomato apple pear tomato with boost=false
    yourResult = tester.search("fig tomato apple pear tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig tomato apple pear tomato",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #434 checking search results for fig tomato apple pear tomato with boost=false");
    // Test #435 checking search results for apple peach with boost=true
    yourResult = tester.search("apple peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #435 checking search results for apple peach with boost=true");
    // Test #436 checking search results for apple peach with boost=false
    yourResult = tester.search("apple peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #436 checking search results for apple peach with boost=false");
    // Test #437 checking search results for apricot cherry kiwi cherry lime with boost=true
    yourResult = tester.search("apricot cherry kiwi cherry lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot cherry kiwi cherry lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #437 checking search results for apricot cherry kiwi cherry lime with boost=true");
    // Test #438 checking search results for apricot cherry kiwi cherry lime with boost=false
    yourResult = tester.search("apricot cherry kiwi cherry lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot cherry kiwi cherry lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #438 checking search results for apricot cherry kiwi cherry lime with boost=false");
    // Test #439 checking search results for blueberry cherry lime tomato with boost=true
    yourResult = tester.search("blueberry cherry lime tomato", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry lime tomato",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #439 checking search results for blueberry cherry lime tomato with boost=true");
    // Test #440 checking search results for blueberry cherry lime tomato with boost=false
    yourResult = tester.search("blueberry cherry lime tomato", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry cherry lime tomato",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #440 checking search results for blueberry cherry lime tomato with boost=false");
    // Test #441 checking search results for blueberry apple orange with boost=true
    yourResult = tester.search("blueberry apple orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple orange",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #441 checking search results for blueberry apple orange with boost=true");
    // Test #442 checking search results for blueberry apple orange with boost=false
    yourResult = tester.search("blueberry apple orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "blueberry apple orange",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #442 checking search results for blueberry apple orange with boost=false");
    // Test #443 checking search results for papaya papaya apricot fig with boost=true
    yourResult = tester.search("papaya papaya apricot fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya papaya apricot fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #443 checking search results for papaya papaya apricot fig with boost=true");
    // Test #444 checking search results for papaya papaya apricot fig with boost=false
    yourResult = tester.search("papaya papaya apricot fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya papaya apricot fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #444 checking search results for papaya papaya apricot fig with boost=false");
    // Test #445 checking search results for coconut lime apricot with boost=true
    yourResult = tester.search("coconut lime apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime apricot",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #445 checking search results for coconut lime apricot with boost=true");
    // Test #446 checking search results for coconut lime apricot with boost=false
    yourResult = tester.search("coconut lime apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut lime apricot",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #446 checking search results for coconut lime apricot with boost=false");
    // Test #447 checking search results for kiwi cherry blueberry with boost=true
    yourResult = tester.search("kiwi cherry blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi cherry blueberry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #447 checking search results for kiwi cherry blueberry with boost=true");
    // Test #448 checking search results for kiwi cherry blueberry with boost=false
    yourResult = tester.search("kiwi cherry blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi cherry blueberry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #448 checking search results for kiwi cherry blueberry with boost=false");
    // Test #449 checking search results for peach orange fig with boost=true
    yourResult = tester.search("peach orange fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #449 checking search results for peach orange fig with boost=true");
    // Test #450 checking search results for peach orange fig with boost=false
    yourResult = tester.search("peach orange fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach orange fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #450 checking search results for peach orange fig with boost=false");
    // Test #451 checking search results for pear lime pear peach apple with boost=true
    yourResult = tester.search("pear lime pear peach apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime pear peach apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #451 checking search results for pear lime pear peach apple with boost=true");
    // Test #452 checking search results for pear lime pear peach apple with boost=false
    yourResult = tester.search("pear lime pear peach apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear lime pear peach apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #452 checking search results for pear lime pear peach apple with boost=false");
    // Test #453 checking search results for peach cherry peach cherry with boost=true
    yourResult = tester.search("peach cherry peach cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach cherry peach cherry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #453 checking search results for peach cherry peach cherry with boost=true");
    // Test #454 checking search results for peach cherry peach cherry with boost=false
    yourResult = tester.search("peach cherry peach cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach cherry peach cherry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #454 checking search results for peach cherry peach cherry with boost=false");
    // Test #455 checking search results for coconut cherry coconut orange apple with boost=true
    yourResult = tester.search("coconut cherry coconut orange apple", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut cherry coconut orange apple",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #455 checking search results for coconut cherry coconut orange apple with boost=true");
    // Test #456 checking search results for coconut cherry coconut orange apple with boost=false
    yourResult = tester.search("coconut cherry coconut orange apple", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut cherry coconut orange apple",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #456 checking search results for coconut cherry coconut orange apple with boost=false");
    // Test #457 checking search results for apple peach lime peach with boost=true
    yourResult = tester.search("apple peach lime peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach lime peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #457 checking search results for apple peach lime peach with boost=true");
    // Test #458 checking search results for apple peach lime peach with boost=false
    yourResult = tester.search("apple peach lime peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apple peach lime peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #458 checking search results for apple peach lime peach with boost=false");
    // Test #459 checking search results for papaya apricot coconut lime fig with boost=true
    yourResult = tester.search("papaya apricot coconut lime fig", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya apricot coconut lime fig",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #459 checking search results for papaya apricot coconut lime fig with boost=true");
    // Test #460 checking search results for papaya apricot coconut lime fig with boost=false
    yourResult = tester.search("papaya apricot coconut lime fig", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "papaya apricot coconut lime fig",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #460 checking search results for papaya apricot coconut lime fig with boost=false");
    // Test #461 checking search results for apricot peach peach coconut cherry with boost=true
    yourResult = tester.search("apricot peach peach coconut cherry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach peach coconut cherry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #461 checking search results for apricot peach peach coconut cherry with boost=true");
    // Test #462 checking search results for apricot peach peach coconut cherry with boost=false
    yourResult = tester.search("apricot peach peach coconut cherry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "apricot peach peach coconut cherry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #462 checking search results for apricot peach peach coconut cherry with boost=false");
    // Test #463 checking search results for peach coconut peach pear with boost=true
    yourResult = tester.search("peach coconut peach pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut peach pear",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #463 checking search results for peach coconut peach pear with boost=true");
    // Test #464 checking search results for peach coconut peach pear with boost=false
    yourResult = tester.search("peach coconut peach pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut peach pear",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #464 checking search results for peach coconut peach pear with boost=false");
    // Test #465 checking search results for cherry peach pear lime with boost=true
    yourResult = tester.search("cherry peach pear lime", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach pear lime",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #465 checking search results for cherry peach pear lime with boost=true");
    // Test #466 checking search results for cherry peach pear lime with boost=false
    yourResult = tester.search("cherry peach pear lime", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "cherry peach pear lime",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #466 checking search results for cherry peach pear lime with boost=false");
    // Test #467 checking search results for lime apple lime papaya with boost=true
    yourResult = tester.search("lime apple lime papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apple lime papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #467 checking search results for lime apple lime papaya with boost=true");
    // Test #468 checking search results for lime apple lime papaya with boost=false
    yourResult = tester.search("lime apple lime papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "lime apple lime papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #468 checking search results for lime apple lime papaya with boost=false");
    // Test #469 checking search results for coconut apple papaya orange with boost=true
    yourResult = tester.search("coconut apple papaya orange", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple papaya orange",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #469 checking search results for coconut apple papaya orange with boost=true");
    // Test #470 checking search results for coconut apple papaya orange with boost=false
    yourResult = tester.search("coconut apple papaya orange", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut apple papaya orange",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #470 checking search results for coconut apple papaya orange with boost=false");
    // Test #471 checking search results for orange lime pear coconut apricot with boost=true
    yourResult = tester.search("orange lime pear coconut apricot", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime pear coconut apricot",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #471 checking search results for orange lime pear coconut apricot with boost=true");
    // Test #472 checking search results for orange lime pear coconut apricot with boost=false
    yourResult = tester.search("orange lime pear coconut apricot", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "orange lime pear coconut apricot",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #472 checking search results for orange lime pear coconut apricot with boost=false");
    // Test #473 checking search results for fig apple pear with boost=true
    yourResult = tester.search("fig apple pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple pear",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #473 checking search results for fig apple pear with boost=true");
    // Test #474 checking search results for fig apple pear with boost=false
    yourResult = tester.search("fig apple pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "fig apple pear",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #474 checking search results for fig apple pear with boost=false");
    // Test #475 checking search results for peach peach apple tomato coconut with boost=true
    yourResult = tester.search("peach peach apple tomato coconut", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple tomato coconut",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #475 checking search results for peach peach apple tomato coconut with boost=true");
    // Test #476 checking search results for peach peach apple tomato coconut with boost=false
    yourResult = tester.search("peach peach apple tomato coconut", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach peach apple tomato coconut",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #476 checking search results for peach peach apple tomato coconut with boost=false");
    // Test #477 checking search results for peach coconut cherry kiwi blueberry with boost=true
    yourResult = tester.search("peach coconut cherry kiwi blueberry", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut cherry kiwi blueberry",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #477 checking search results for peach coconut cherry kiwi blueberry with boost=true");
    // Test #478 checking search results for peach coconut cherry kiwi blueberry with boost=false
    yourResult = tester.search("peach coconut cherry kiwi blueberry", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "peach coconut cherry kiwi blueberry",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #478 checking search results for peach coconut cherry kiwi blueberry with boost=false");
    // Test #479 checking search results for pear cherry kiwi papaya pear with boost=true
    yourResult = tester.search("pear cherry kiwi papaya pear", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear cherry kiwi papaya pear",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #479 checking search results for pear cherry kiwi papaya pear with boost=true");
    // Test #480 checking search results for pear cherry kiwi papaya pear with boost=false
    yourResult = tester.search("pear cherry kiwi papaya pear", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "pear cherry kiwi papaya pear",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #480 checking search results for pear cherry kiwi papaya pear with boost=false");
    // Test #481 checking search results for tomato cherry blueberry kiwi papaya with boost=true
    yourResult = tester.search("tomato cherry blueberry kiwi papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry blueberry kiwi papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #481 checking search results for tomato cherry blueberry kiwi papaya with boost=true");
    // Test #482 checking search results for tomato cherry blueberry kiwi papaya with boost=false
    yourResult = tester.search("tomato cherry blueberry kiwi papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "tomato cherry blueberry kiwi papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #482 checking search results for tomato cherry blueberry kiwi papaya with boost=false");
    // Test #483 checking search results for coconut peach tomato cherry peach with boost=true
    yourResult = tester.search("coconut peach tomato cherry peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach tomato cherry peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #483 checking search results for coconut peach tomato cherry peach with boost=true");
    // Test #484 checking search results for coconut peach tomato cherry peach with boost=false
    yourResult = tester.search("coconut peach tomato cherry peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach tomato cherry peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #484 checking search results for coconut peach tomato cherry peach with boost=false");
    // Test #485 checking search results for kiwi apple apple coconut papaya with boost=true
    yourResult = tester.search("kiwi apple apple coconut papaya", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apple apple coconut papaya",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #485 checking search results for kiwi apple apple coconut papaya with boost=true");
    // Test #486 checking search results for kiwi apple apple coconut papaya with boost=false
    yourResult = tester.search("kiwi apple apple coconut papaya", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "kiwi apple apple coconut papaya",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #486 checking search results for kiwi apple apple coconut papaya with boost=false");
    // Test #487 checking search results for coconut peach with boost=true
    yourResult = tester.search("coconut peach", true, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach",
        true,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #487 checking search results for coconut peach with boost=true");
    // Test #488 checking search results for coconut peach with boost=false
    yourResult = tester.search("coconut peach", false, 10);
    TestingTools.checkSearch(
        yourResult,
        "coconut peach",
        false,
        passOut,
        failOut,
        "FruitsTinySearchTester",
        "Test #488 checking search results for coconut peach with boost=false");
    failOut.close();
    passOut.close();
  }
}
