package example
//import org.apache.spark.eventhubs._

object HelloWorld {

	def main(args: Array[String]): Unit = {
		println("Hello, world!")

// To connect to an event hub, EntityPath is required as part of the connection string.
// Here, we assume that the connection string from the Azure portal does not have the EntityPath part.
		/*val connectionString = ConnectionStringBuilder("Endpoint=sb://beacon-analytics-dev.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=OT0ZvxkubL86WMjS+6UalEbWKDCjmvIum/vHKUUOj4M=")
		  .setEventHubName("eventhub1")
		  .build 
		val ehConf = EventHubsConf(connectionString)
		  .setStartingPosition(EventPosition.fromEndOfStream)

		// Create a stream that reads data from the specified Event Hub.
		val reader = spark.readStream
		  .format("eventhubs")
		  .options(ehConf.toMap)
		  .load()
		val eventhubs = reader.select($"body" cast "string")

		eventhubs.writeStream
		  .format("console")
		  .outputMode("append")
		  .start()
		  .awaitTermination()
		  */
	}
}	