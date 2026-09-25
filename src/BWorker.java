public class BWorker {
    class BadCreditHistoryException extends Exception {
    }

    class ProblemWithLawException extends Exception {
    }

    class BankClient {
    }

    interface BankWorker {
        boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException;

    }

    class Method {
        boolean getCreditForCLient(BankWorker worker, BankClient client) {
            try {
                return worker.checkClientForCredit(client);
            } catch (BadCreditHistoryException e) {
                System.out.println("Проблемы с банковской историей");
                return false;
            } catch (ProblemWithLawException e) {
                return false;
            }
        }
    }
}
