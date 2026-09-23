class Analyzer {
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

    static class SpamAnalizer implements TextAnalyzer {
        String[] keywords = {"SPAM", "SALE", "FREE"};

        @Override
        public Label processText(String text) {
            for (String keyword : keywords) {
                if (text.contains(keyword)) {
                    return Label.SPAM;
                }
            }
            return Label.OK;
        }
    }


    static class NegativeTextAnalizer implements TextAnalyzer {
        String[] keywords = {":(", "("};

        @Override
        public Label processText(String text) {
            for (String keyword : keywords) {
                if (text.contains(keyword)) {
                    return Label.NEGATIVE_TEXT;
                }
            }
            return Label.OK;
        }
    }

    static class TooLongTextAnalizer implements TextAnalyzer {
        int maxLenght = 50;

        @Override
        public Label processText(String text) {
            if (text.length() > maxLenght) {
                return Label.TOO_LONG;
            }
            return Label.OK;
        }

    }

    public Label[] analizeText(TextAnalyzer[] analyzers, String text) {
        Label[] result = new Label[analyzers.length];
        for (int i = 0; i < analyzers.length; i++) {
            result[i] = analyzers[i].processText(text);
        }
        return result;
    }

}