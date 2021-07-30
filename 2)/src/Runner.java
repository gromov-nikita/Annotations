import extractor.classes.*;
import extractor.service.InterfaceExtractorProcessor;

import java.io.IOException;

/*
Exercise 2: (3) Add support for division to the interface extractor.
*/
public class Runner {
    public static void main(String[] args) throws IOException {
        InterfaceExtractorProcessor.extract(Division.class);
        InterfaceExtractorProcessor.extract(Multiplier.class);
    }
}
