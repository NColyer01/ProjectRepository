package main.java.BackgroundAttributes;

//import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class Flaws {
//    AmazonDynamoDB dynamoDBClient = DynamoDbClientProvider.getDynamoDBClient();
//    DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
    Alignment alignment;

    public Flaws(Alignment alignment) {
        this.alignment = alignment;
    }

    public static Flaws getRandomFlaws() {
        Alignment alignment = Alignment.getRandomAlignment();
        return new Flaws(alignment);
    }
}
