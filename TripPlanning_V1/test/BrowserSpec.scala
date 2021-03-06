import org.scalatestplus.play._
import org.scalatestplus.play.guice.GuiceOneServerPerTest

import play.api.test._
import play.api.test.Helpers.{ GET => GET_REQUEST, _ }

class BrowserSpec extends PlaySpec
  with OneBrowserPerTest
  with GuiceOneServerPerTest
  with HtmlUnitFactory
  with ServerProvider {
  "Application" should {

    "work from within a browser" in {

      go to ("http://localhost:" + port)

      pageSource must include ("A simple trip planning application")
    }
  }
}
