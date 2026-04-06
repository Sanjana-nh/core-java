class GovernmentRunner {
    public static void main(String[] args) {
        Government gov = new Government();

        gov.addCompetitiveExamName("UPSC Civil Services");
        gov.addCompetitiveExamName("SSC CGL");
        gov.addCompetitiveExamName("IBPS PO");
        gov.addCompetitiveExamName("SBI PO");
        gov.addCompetitiveExamName("RBI Grade B");
        gov.addCompetitiveExamName("RRB NTPC");
        gov.addCompetitiveExamName("NDA");
        gov.addCompetitiveExamName("CDS");
        gov.addCompetitiveExamName("GATE");

        gov.getCompetitiveExamNames();
		gov.getCompetitiveExamNamesByIndex(9);
		gov.getIndexByCompetitiveExamNames("SBI PO");
		gov.updateCompetitiveExamNames("UPSC Civil Services", "UPSC CSE");
		gov.getCompetitiveExamNames();
		gov.deleteCompetitiveExamNames("SSC CGL");
		gov.getCompetitiveExamNames();
    }
}