<?php
require 'vendor/autoload.php';

use Behat\Mink\Mink,
    Behat\Mink\Session,
    Behat\Mink\Driver\Selenium2Driver;

use Selenium\Client as SeleniumClient;

/**
*
*/
class OwnerTest extends PHPUnit_Framework_TestCase
{
    public function testSaveSuccessfull()
    {
        $url = 'http://localhost:9966/petclinic';
        $browser = 'firefox';

        $driver = new \Behat\Mink\Driver\Selenium2Driver( 'firefox', 'base_url');

        // init session:
        $session = new \Behat\Mink\Session($driver);

        // start session:
        $session->start();

        // open some page in browser:
        $session->visit($url);

        //navigate through some pages
        $page = $session->getPage();
        $page->findLink('Find owners')->click();
        $page->findLink('Add Owner')->click();

        //complete a form
        $page->findField('firstName')->setValue('My Name');
        $page->findField('lastName')->setValue('My Last Name');
        $page->findField('city')->setValue('My City');
        $page->findField('address')->setValue('My Address');
        $page->findField('telephone')->setValue('123456');

        $page->find('css', '.form-actions button')->click();

        $title = $page->find('css', 'div.container h2')->getText();

        $this->assertEquals('Owner Information', $title);

        //close browser
        $session->stop();
    }
}
