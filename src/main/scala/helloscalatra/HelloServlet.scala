package helloscalatra

import org.scalatra._
import scalate.ScalateSupport

class HelloServlet extends HelloscalatraStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
      </body>
    </html>
  }

}
