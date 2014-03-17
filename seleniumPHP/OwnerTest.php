<?php
require 'vendor/autoload.php';

use Behat\Mink\Mink,
    Behat\Mink\Session,
    Behat\Mink\Driver\Selenium2Driver;

use Selenium\Client as SeleniumClient;

$url = 'http://localhost:9966/petclinic';
$browser = 'firefox';

//$mink = new Mink(array(
//      'selenium2' => new Session(new Selenium2Driver($browser, null, $url)),
//    ));
//
//$mink->getSession('selenium2')->getPage()->findLink('Find owners')->click();

$driver = new \Behat\Mink\Driver\Selenium2Driver( 'firefox', 'base_url');

// init session:
$session = new \Behat\Mink\Session($driver);

// start session:
$session->start();

// open some page in browser:
$session->visit($url);
